package com.idat.MicroservicioCliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MicroservicioCliente.DTO.PizzaDTO;
import com.idat.MicroservicioCliente.client.OpenFeignClient;
import com.idat.MicroservicioCliente.model.Cliente;
import com.idat.MicroservicioCliente.model.ClienteDetalle;
import com.idat.MicroservicioCliente.model.ClientePizzaFK;
import com.idat.MicroservicioCliente.repository.IClientePizzaRepository;
import com.idat.MicroservicioCliente.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired private IClienteRepository repository;
	@Autowired private OpenFeignClient feign;
	@Autowired private IClientePizzaRepository clientePizzaRepository;
	@Override
	public List<Cliente> listarClientes() {
	
		return repository.findAll();
	}

	@Override
	public void guardarCliente(Cliente cli) {
		repository.save(cli);
	}

	@Override
	public void asignarPizzas() {
	List<PizzaDTO> listado=feign.listadoPizzas();
			
			ClienteDetalle detalle = null;
			ClientePizzaFK fk = null;
			
			for(PizzaDTO pizzaDTO : listado) {
				
				detalle = new ClienteDetalle();
				fk = new ClientePizzaFK();
				
				fk.setIdPizza(pizzaDTO.getIdPizza());
				fk.setIdCliente(1);
			
				detalle.setFk(fk);
				clientePizzaRepository.save(detalle);
			}
	}

}
