package com.satusehat.satusehat_restapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satusehat.satusehat_restapi.domain.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long>{
//	Optional<Products> findBy
}
