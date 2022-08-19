package com.idat.MicroservicioCliente.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detalle_cliente")
public class ClienteDetalle {

	@Id
	private ClientePizzaFK fk= new ClientePizzaFK();

	public ClientePizzaFK getFk() {
		return fk;
	}

	public void setFk(ClientePizzaFK fk) {
		this.fk = fk;
	}
}
