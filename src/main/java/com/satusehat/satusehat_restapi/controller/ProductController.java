package com.satusehat.satusehat_restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.satusehat.satusehat_restapi.domain.Products;
import com.satusehat.satusehat_restapi.service.ProductService;
import com.satusehat.satusehat_restapi.util.Response;

@RestController
@RequestMapping(value = "product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	private String service = "Products";
	
	@PostMapping
	ResponseEntity<Response> create(@RequestBody @Validated Products products) {
		
		String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		
		Response response = new Response();
		response.setService(this.getClass().getName() + nameOfCurrMethod);
		response.setMessage("Save Product Success");
		
		response.setData(productService.create(products));
		
		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.APPLICATION_JSON).body(response);
		
	}
	
	@PutMapping
	ResponseEntity<Response> update(@PathVariable ("productId") Long productId, @Validated Products products) {
		
		String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();

		Response response = new Response();
		response.setService(this.getClass().getName() + nameOfCurrMethod);
		response.setMessage("Update Product Success");
		
		response.setData(productService.update(productId, products));
		
		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.APPLICATION_JSON).body(response);
		
	}
	
	@GetMapping(value = "productId")
    ResponseEntity<Response> getById (@PathVariable ("productId")Long productId) {

        String nameofCurrMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();

        Response response = new Response();
        response.setService(this.getClass().getName() + nameofCurrMethod);
        response.setMessage("GetById Success");

        response.setData(productService.findById(productId));

        return  ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @GetMapping
    ResponseEntity<Response> findAll ()
    {

        String nameofCurrMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();

        Response response = new Response();
        response.setService(this.getClass().getName() + nameofCurrMethod);
        response.setMessage("FindAll Products Success");
        response.setData(productService.findAll());

        return  ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }
    
    @DeleteMapping(value = "productId")
    ResponseEntity<Response> deleteById (@PathVariable ("productId")Long productId)
    {

        String nameofCurrMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();

        Response response = new Response();
        response.setService(this.getClass().getName() + nameofCurrMethod);
        response.setMessage("Delete Products Success");
        response.setData(productService.findById(productId));

        productService.delete(productId);

        return  ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

}
