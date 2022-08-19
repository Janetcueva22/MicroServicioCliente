package com.idat.MicroservicioCliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.MicroservicioCliente.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer>{

}
