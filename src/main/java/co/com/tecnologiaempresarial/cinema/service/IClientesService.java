package co.com.tecnologiaempresarial.cinema.service;

import java.util.List;

import co.com.tecnologiaempresarial.cinema.entity.Clientes;

public interface IClientesService {
	List<Clientes> getClientes();
	Clientes saveCliente(Clientes cli);
	Clientes getClienteById(long id);
	void deleteCliente(long id);
}
