package co.com.tecnologiaempresarial.cinema.service;

import java.util.List;

import co.com.tecnologiaempresarial.cinema.entity.SalasSucursal;

public interface ISalasSucursalesService {
	SalasSucursal crearSalaXSucursal(SalasSucursal salaS);
	List<SalasSucursal> getAllSalasSucursales();

}
