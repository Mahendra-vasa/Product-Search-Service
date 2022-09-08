package com.ibm.productsearchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@ComponentScan(basePackages = "com.ibm.productsearchservice")
@Configuration
public class ProductSearchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductSearchServiceApplication.class, args);
	}
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
