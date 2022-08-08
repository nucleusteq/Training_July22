package com.SpringBoot.SpringBootFirst.app.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.SpringBootFirst.app.Domain.Product;
import com.SpringBoot.SpringBootFirst.app.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProduct() {
		return productRepository.getAllProduct();
	}

	@Override
	public Product saveProduct(Product product) {
		Product stu =productRepository.saveProduct(product);
		return stu;
	}

	@Override
	public String deleteProduct(Integer id) {
		System.out.println("id:" + id);
		if(id !=null && id > 0) {
			System.out.println("To be deleted");
			return productRepository.deleteProduct(id);
			
		}else {
			return "id not valid";
		}
	}

	@Override
	public Product updateProduct(Integer id, Product product) {
		// TODO Auto-generated method stub
		return productRepository.updateProduct(id, product);
	}

	@Override
	public List<Product> getProductByName(String firstName) {
		// TODO Auto-generated method stub
		return productRepository.getProductByName(firstName);
	}

	@Override
	public String buyProduct(String name, Integer amount) {
		// TODO Auto-generated method stub
		
		List<Product> products =  productRepository.getProductByName(name);
		if( products.size()!=1) 
			return "Multiple products with same name";
		Product product = products.get(0);
		System.out.println(product.toString());
		System.out.println(amount);
		if(product.getPrice()>amount)
			return "Price is more than input amount";
		if(product.getQuantity()<=0)
			return "Insufficient quantity";
		
		product.setQuantity(product.getQuantity()-1);
		productRepository.updateProduct(product.getId(), product);
		
		Integer returnval = amount-product.getPrice();

		return 	getDenominations(returnval);
	}
	
	private String getDenominations(Integer amount) {
		return amount.toString();
	}
	
}
