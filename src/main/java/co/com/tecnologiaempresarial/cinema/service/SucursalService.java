package co.com.tecnologiaempresarial.cinema.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.tecnologiaempresarial.cinema.entity.Sucursales;
import co.com.tecnologiaempresarial.cinema.repository.ISucursalesRepository;

@Service
public class SucursalService implements ISucursalService{

	@Autowired
	private ISucursalesRepository sucursalRepository;

	@Override
	public Sucursales crearSucursal(Sucursales sucursal) {
		Sucursales suc = sucursalRepository.save(sucursal);
		return suc;
	}

	@Override
	public List<Sucursales> getAllSucursales() {
		List<Sucursales> list = new ArrayList<>();
		sucursalRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

}
