package com.idat.MicroservicioCliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MicroservicioCliente.model.Cliente;
import com.idat.MicroservicioCliente.service.IClienteService;

@Controller
@RequestMapping("/api/v1/cliente")
public class ClienteController {

	@Autowired private IClienteService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Cliente> listarClientes(){
		return service.listarClientes();
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarCliente(@RequestBody Cliente cli) {
		service.guardarCliente(cli);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarPizzas() {
		service.asignarPizzas();
	}
}
