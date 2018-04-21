package co.com.tecnologiaempresarial.cinema.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import co.com.tecnologiaempresarial.cinema.entity.Ciudades;
import co.com.tecnologiaempresarial.cinema.entity.Maestra;
import co.com.tecnologiaempresarial.cinema.entity.SalasSucursal;
import co.com.tecnologiaempresarial.cinema.entity.Sucursales;
import co.com.tecnologiaempresarial.cinema.entity.TipoSalas;
import co.com.tecnologiaempresarial.cinema.service.ICiudadesService;
import co.com.tecnologiaempresarial.cinema.service.IMaestraService;
import co.com.tecnologiaempresarial.cinema.service.ISalasSucursalesService;
import co.com.tecnologiaempresarial.cinema.service.ISucursalService;
import co.com.tecnologiaempresarial.cinema.service.ITiposSalasService;

@RestController
@RequestMapping("cinemaIngeneo")
public class AppController {

	@Autowired
	private ICiudadesService ciudadesService;

	@Autowired
	private ISucursalService sucursalesService;

	@Autowired
	private IMaestraService maestraService;

	@Autowired
	private ITiposSalasService tSalasService;

	@Autowired
	private ISalasSucursalesService salasSucurService;

	@GetMapping("ciudades")
	public ResponseEntity<List<Ciudades>> getAllCiudades() {
		List<Ciudades> list = ciudadesService.getAllCiudades();
		return new ResponseEntity<List<Ciudades>>(list, HttpStatus.OK);
	}

	@RequestMapping(value = "configurar", method = RequestMethod.POST)
	public ResponseEntity<Void> configurarAplicacion(@RequestBody Maestra config, UriComponentsBuilder builder) {
		Maestra article = maestraService.configurarAplicacion(config);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/cliente/{id}").buildAndExpand(article.getClave()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "sucursal", method = RequestMethod.POST)
	public ResponseEntity<Void> crearSucursal(@RequestBody Sucursales sucursal, UriComponentsBuilder builder) {
		Sucursales article = sucursalesService.crearSucursal(sucursal);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/cliente/{id}").buildAndExpand(article.getId_sucursal()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("sucursales")
	public ResponseEntity<List<Sucursales>> getAllSucursales() {
		List<Sucursales> list = sucursalesService.getAllSucursales();
		return new ResponseEntity<List<Sucursales>>(list, HttpStatus.OK);
	}

	@RequestMapping(value = "tipoSala", method = RequestMethod.POST)
	public ResponseEntity<Void> crearTiposSalas(@RequestBody TipoSalas tSala, UriComponentsBuilder builder) {
		TipoSalas article = tSalasService.crearTiposSalas(tSala);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/cliente/{id}").buildAndExpand(article.getTipo_sala()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("tipoSalas")
	public ResponseEntity<List<TipoSalas>> getAllTiposSalas() {
		List<TipoSalas> list = tSalasService.getAllTiposSalas();
		return new ResponseEntity<List<TipoSalas>>(list, HttpStatus.OK);
	}

	@RequestMapping(value = "registrarSala", method = RequestMethod.POST)
	public ResponseEntity<Void> crearSalaXSucursal(@RequestBody SalasSucursal sucursal, UriComponentsBuilder builder) {
		List<Maestra> configuraciones = maestraService.getConfiguraciones();
		Map<String, String> configuSala = new HashMap<>();
		for (Maestra maestra : configuraciones) {
			configuSala.put(maestra.getClave(), maestra.getValor());			
		}

		SalasSucursal salaCreada = new SalasSucursal();

		if(sucursal.getNum_fila() >= Integer.parseInt(configuSala.get("MIN_FILA")) &&
				sucursal.getNum_fila() <= Integer.parseInt(configuSala.get("MAX_FILA")) &&
				sucursal.getNum_silla_fila() >= Integer.parseInt(configuSala.get("MIN_SILLA_FILA")) &&
				sucursal.getNum_fila() >= Integer.parseInt(configuSala.get("MAX_SILLA_FILA"))
				) {
			salaCreada = salasSucurService.crearSalaXSucursal(sucursal);
		}

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/cliente/{id}").buildAndExpand(salaCreada.getId_sucursal()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("salas")
	public ResponseEntity<List<SalasSucursal>> getAllSalas() {
		List<SalasSucursal> list = salasSucurService.getAllSalasSucursales();
		return new ResponseEntity<List<SalasSucursal>>(list, HttpStatus.OK);
	}

}
