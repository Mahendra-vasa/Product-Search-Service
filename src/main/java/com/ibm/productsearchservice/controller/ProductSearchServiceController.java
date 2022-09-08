package com.ibm.productsearchservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ibm.productsearchservice.model.ProductDetails;

@RestController
public class ProductSearchServiceController {
	   @Autowired
	   RestTemplate  restTemplate;
	
	    @GetMapping("/getProductDetails/{id}")
	    public ResponseEntity<ProductDetails> getProductById(@PathVariable int id) {
	    	System.out.println("getProductById");
	    	ResponseEntity<ProductDetails> productDetails = restTemplate.getForEntity("http://localhost:8082/getProduct/"+id, ProductDetails.class);
	    	return productDetails;
	    }
}
