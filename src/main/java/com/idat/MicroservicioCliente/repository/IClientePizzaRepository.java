package com.idat.MicroservicioCliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MicroservicioCliente.model.ClienteDetalle;

@Repository
public interface IClientePizzaRepository extends JpaRepository<ClienteDetalle, Integer>{

}
