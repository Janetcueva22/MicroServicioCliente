package com.idat.MicroservicioCliente.service;

import java.util.List;

import com.idat.MicroservicioCliente.model.Cliente;


public interface IClienteService {

	public List<Cliente> listarClientes();
	public void guardarCliente(Cliente cli);
	public void asignarPizzas();
}
