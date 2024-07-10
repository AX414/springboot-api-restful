package com.example.springboot.models;

import jakarta.persistence.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name="TB_PRODUCTS")
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable {
	private static final long serialVerionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //Não precisarei me importar em gerar um valor para o id.
	private UUID idProduct; //UUID é um identificador muito utilizado em arquiteturas distribuídas pelo fato de UUIDs serem universais e não houver conflitos
	private String name;
	private BigDecimal value;

	public UUID getIdProduct() {
		return idProduct;
	}

	public void setIdProducto(UUID idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
}