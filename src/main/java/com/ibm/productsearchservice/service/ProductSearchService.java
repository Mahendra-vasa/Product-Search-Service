package com.ibm.productsearchservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductSearchService {
	@Autowired
	RestTemplate  restTemplate;
	
	
}
