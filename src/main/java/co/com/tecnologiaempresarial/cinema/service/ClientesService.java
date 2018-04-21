package co.com.tecnologiaempresarial.cinema.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.tecnologiaempresarial.cinema.entity.Clientes;
import co.com.tecnologiaempresarial.cinema.repository.IClientesRepository;

@Service
public class ClientesService implements IClientesService{

	@Autowired
	private IClientesRepository clientesRepository;

	@Override
	public List<Clientes> getClientes() {
		List<Clientes> list = new ArrayList<>();
		clientesRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public Clientes saveCliente(Clientes cli) {
		Clientes clie = clientesRepository.save(cli);
		return clie;
	}

	@Override
	public Clientes getClienteById(long id) {
		Clientes cliente = clientesRepository.findOne(id);
		return cliente;
	}

	@Override
	public void deleteCliente(long id) {
		clientesRepository.delete(id);		
	}
}
