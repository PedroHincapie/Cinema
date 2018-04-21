package co.com.tecnologiaempresarial.cinema.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.tecnologiaempresarial.cinema.entity.SalasSucursal;
import co.com.tecnologiaempresarial.cinema.repository.ISalasSucursalesRepository;

@Service
public class SalasSucursalesService implements ISalasSucursalesService{

	@Autowired
	private ISalasSucursalesRepository salaSucRepository;


	@Override
	public SalasSucursal crearSalaXSucursal(SalasSucursal salaS) {
		SalasSucursal salaSuc = salaSucRepository.save(salaS);
		return salaSuc;
	}

	@Override
	public List<SalasSucursal> getAllSalasSucursales() {
		List<SalasSucursal> list = new ArrayList<>();
		salaSucRepository.findAll().forEach(e -> list.add(e));
		return list;
	}
}
