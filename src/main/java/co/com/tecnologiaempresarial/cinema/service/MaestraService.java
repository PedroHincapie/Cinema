package co.com.tecnologiaempresarial.cinema.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.tecnologiaempresarial.cinema.entity.Maestra;
import co.com.tecnologiaempresarial.cinema.repository.IMaestraRepository;

@Service
public class MaestraService implements IMaestraService{

	@Autowired
	private IMaestraRepository maestraRepository;

	@Override
	public List<Maestra> getConfiguraciones() {
		List<Maestra> list = new ArrayList<>();
		maestraRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public Maestra configurarAplicacion(Maestra confi) {
		Maestra config = maestraRepository.save(confi);
		return config;
	}

}
