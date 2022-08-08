package com.SpringBoot.SpringBootFirst.app.service;

import java.util.List;

import com.SpringBoot.SpringBootFirst.app.Domain.Product;


public interface ProductService {

	
		public List<Product> getAllProduct();
		public Product saveProduct(Product product) ;
		public String deleteProduct(Integer id);
		public Product updateProduct(Integer id, Product product);
		public List<Product> getProductByName(String firstName);
		public String buyProduct(String name, Integer amount);

}
