package co.com.tecnologiaempresarial.cinema.service;

import java.util.List;

import co.com.tecnologiaempresarial.cinema.entity.TipoSalas;

public interface ITiposSalasService {
	TipoSalas crearTiposSalas(TipoSalas tipoSala);
	List<TipoSalas> getAllTiposSalas();

}
