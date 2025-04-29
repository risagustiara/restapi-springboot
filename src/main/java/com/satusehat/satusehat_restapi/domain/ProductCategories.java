package com.satusehat.satusehat_restapi.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ProductCategories {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Untuk Menggenerate AutoIncrement
    private Long categoryId;
	
	@Column(name = "category_name")
	private String categoryName;
	

    @NotNull
	@OneToMany(mappedBy = "productCategories")
	private List<Products> products;
	
	
}