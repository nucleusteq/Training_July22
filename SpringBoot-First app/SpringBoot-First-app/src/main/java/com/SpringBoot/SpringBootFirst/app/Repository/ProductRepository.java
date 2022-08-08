package com.SpringBoot.SpringBootFirst.app.Repository;

import java.util.List;

import com.SpringBoot.SpringBootFirst.app.Domain.Product;

public interface ProductRepository {
		public List<Product> getAllProduct();
		
		public Product saveProduct(Product product);
		
		public String deleteProduct(Integer id);
		
		public Product updateProduct(Integer id , Product product);
		
		public List<Product> getProductByName(String firstName);

}