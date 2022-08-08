package com.SpringBoot.SpringBootFirst.app.Repository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.SpringBoot.SpringBootFirst.app.Domain.Product;


@Repository
public class ProductRepositoryImpl implements ProductRepository {

	static List<Product> products;
	
	public ProductRepositoryImpl() {
		products = new ArrayList<Product>();
		
		products.add(new Product(1, "Chocolate", 1, "chocolate", 1));
		products.add(new Product(2, "Milk" , 21, "milk", 1));
		products.add(new Product(3, "Detergent", 55 ,"detergent", 1));
	}
	
	@Override
	public List<Product> getAllProduct() {
		
		return products;
	}

	@Override
	public Product saveProduct(Product product) {
		products.add(product);
		return product;
	}

	@Override
	public String deleteProduct(Integer id) {
		System.out.println("Product id to deleted"+id);
		String s="";
		Iterator<Product> iterator = products.iterator();
		int index =0;
		for(int i = 0 ; i<products.size() ;i++) {
			Product product = products.get(i);
			if(product.getId() == id) {
				index = i;
			}
		}
		products.remove(index);
		s = "product deleted";
		
		return s;
	}

	@Override
	public Product updateProduct(Integer id, Product product) {

		for(Product s : products) {
			if(s.getId() == id) {
				s.setName(product.getName());
				s.setDescription(product.getDescription());
				s.setPrice(product.getPrice());
				s.setId(id);
			}
		}
		return product;
	}


	@Override
	public List<Product> getProductByName(String firstName) {
		// TODO Auto-generated method stub
		List<Product> filterProduct  = new ArrayList<Product>();
		for(Product product:products) {
			if(product.getName().equals(firstName)) {
				filterProduct.add(product);
			}
		}
		
		return filterProduct;
	}

	
	
}
