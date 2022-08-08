package com.SpringBoot.SpringBootFirst.app.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.SpringBootFirst.app.Domain.BuyInput;
import com.SpringBoot.SpringBootFirst.app.Domain.Product;
import com.SpringBoot.SpringBootFirst.app.service.ProductService;



@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(path = "getProducts" , method = RequestMethod.GET)
	public @ResponseBody List<Product> getAllProduct(){
		return productService.getAllProduct();
	}
	
	@RequestMapping(path = "/save" , method = RequestMethod.POST)
	public @ResponseBody Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}

	@RequestMapping(path = "/delete/{id}" ,  method =RequestMethod.DELETE)
	public String deleteProduct(@PathVariable("id") Integer id) {
		System.out.println("id:"+id);
		return productService.deleteProduct(id);
	}
	
	
	@RequestMapping(path = "/update/{id}" , method = RequestMethod.PUT)
	public @ResponseBody Product updateProduct(@PathVariable("id") Integer id , @RequestBody Product product) {
		return productService.updateProduct(id, product);
	}
	
	@RequestMapping(path = "/getProductByName" ,  method=RequestMethod.GET)
	public List<Product> getProductByFirstName(@RequestParam("name") String name){
		return productService.getProductByName(name);
	}
	
	@RequestMapping(path = "/buyProduct", method = RequestMethod.PUT)
	public @ResponseBody String buyProduct(@RequestBody BuyInput buyInput) {
		return productService.buyProduct(buyInput.getName(), buyInput.getAmount());
	}

}
