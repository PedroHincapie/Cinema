package co.com.tecnologiaempresarial.cinema.service;

import java.util.List;

import co.com.tecnologiaempresarial.cinema.entity.Sucursales;

public interface ISucursalService {
	Sucursales crearSucursal(Sucursales sucursal);
	List<Sucursales> getAllSucursales();

}
