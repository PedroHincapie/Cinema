package co.com.tecnologiaempresarial.cinema.service;

import java.util.List;

import co.com.tecnologiaempresarial.cinema.entity.Maestra;

public interface IMaestraService {
	List<Maestra> getConfiguraciones(); 
	Maestra configurarAplicacion(Maestra confi);
}
