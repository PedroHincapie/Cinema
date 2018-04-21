package co.com.tecnologiaempresarial.cinema.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.tecnologiaempresarial.cinema.entity.TipoSalas;
import co.com.tecnologiaempresarial.cinema.repository.ITiposSalasRepository;

@Service
public class TiposSalasService implements ITiposSalasService {

	@Autowired
	private ITiposSalasRepository tipoSalasRepository;

	@Override
	public TipoSalas crearTiposSalas(TipoSalas tipoSala) {
		TipoSalas tSalas = tipoSalasRepository.save(tipoSala);
		return tSalas;
	}

	@Override
	public List<TipoSalas> getAllTiposSalas() {
		List<TipoSalas> list = new ArrayList<>();
		tipoSalasRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

}
