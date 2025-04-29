package com.satusehat.satusehat_restapi.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Products {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Untuk Menggenerate AutoIncrement
    private Long productId;
	
    @NotNull
	@Column(name = "product_name")
	private String productName;

    @NotNull
	@Column(name = "sku", unique = true)
	private String sku;

    @NotNull
	@Column(name = "image")
	private String image;

    @NotNull
	@Column(name = "price")
	private BigDecimal price;
	
	@Column(name = "description")
	private String description;

    @NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "category_id")
	private ProductCategories productCategories;
	
	
}