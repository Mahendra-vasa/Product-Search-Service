package com.ibm.productsearchservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	   
	   private static final Logger log = LoggerFactory.getLogger(ProductSearchServiceController.class);
	   
	    @GetMapping("/getProductDetails/{id}")
	    public ResponseEntity<ProductDetails> getProductById(@PathVariable int id) {
	    	log.info("getProductById"+id);
//	    	ResponseEntity<ProductDetails> productDetails = restTemplate.getForEntity("http://localhost:8082/getProduct/"+id, ProductDetails.class);
	    	ResponseEntity<ProductDetails> productDetails = restTemplate.getForEntity("http://productservicecontainer-env.eba-f9662aq2.us-east-1.elasticbeanstalk.com/getProduct/"+id, ProductDetails.class);
	    	return productDetails;
	    }
}
