package co.com.tecnologiaempresarial.cinema.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.tecnologiaempresarial.cinema.entity.Ciudades;
import co.com.tecnologiaempresarial.cinema.repository.ICiudadesRepository;

@Service
public class CiudadesService implements ICiudadesService {

	@Autowired
	private ICiudadesRepository ciudaRepository;

	@Override
	public List<Ciudades> getAllCiudades() {
		List<Ciudades> list = new ArrayList<>();
		ciudaRepository.findAll().forEach(e -> list.add(e));
		return list;
	}




}
