package com.ibm.productsearchservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ibm.productsearchservice.model.ProductDetails;

@Service
public class ProductSearchService {
	@Autowired
	RestTemplate  restTemplate;
	
	
}