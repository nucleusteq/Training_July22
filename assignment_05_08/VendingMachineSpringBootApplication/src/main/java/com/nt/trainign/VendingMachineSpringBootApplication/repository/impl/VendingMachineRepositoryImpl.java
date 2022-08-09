package com.nt.trainign.VendingMachineSpringBootApplication.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nt.trainign.VendingMachineSpringBootApplication.model.Product;
import com.nt.trainign.VendingMachineSpringBootApplication.model.VendingMachine;
import com.nt.trainign.VendingMachineSpringBootApplication.repository.VendingMachineRepository;

@Repository
public class VendingMachineRepositoryImpl implements VendingMachineRepository {
	public static VendingMachine vendingMachine;
	public VendingMachineRepositoryImpl() {
		vendingMachine=new VendingMachine();
		List<Product> products=new ArrayList<Product>();
		Product product1=new Product(1,"Tea","aromatic beverage",30,10);
		Product product2=new Product(2,"Coffee","Dark coffee",75,30);
		Product product3=new Product(3,"lemon Tea","Fresh Lime tea",45,20);
		products.add(product1);
		products.add(product2);
		products.add(product3);
		vendingMachine.setProducts(products);
	}

	@Override
	public List<Product> getAllProducts() {
		System.out.println(vendingMachine.getBalance());
		return vendingMachine.getProducts();
	}

	@Override
	public String sellProduct(int id,int money) {
		List<Product> products=vendingMachine.getProducts();
		String message="",change="";
		for(Product product:products) {
			if(product.getId() == id ) {
				if(product.getQuantity() > 0 && product.getPrice()<= money) {
					int machineBalance=vendingMachine.getBalance();
					vendingMachine.setBalance(machineBalance+product.getPrice());
					product.setQuantity(product.getQuantity()-1);
					change= calculateChange(product.getPrice(),money);
					message+="Here is your product \n Name: "+product.getName()+"\n Description: "+product.getDescription();
				}
				else {
					if(product.getQuantity() == 0) {
						message+="Sold Out!";
					}
					else if(product.getPrice()> money) {
						message+="Insufficient Funds, please collect your cash "+money+" INR";
					}
				}
			}

		}
		
		return message+""+change;
	}

	@Override
	public String calculateChange(int sellingPrice, int money) {
		int fiftyRupeesCount=0;
		int twentyRupeesCount=0;
		int tenRupeesCount=0;
		int fiveRupeesCount=0;
		String change="";
		int temp=money-sellingPrice;
		System.out.println(temp);
		while(temp>0) {
			if(temp>=50) {
				fiftyRupeesCount+=temp/50;
				temp=temp%50;
			}
			else if(temp>=20) {
				twentyRupeesCount+=temp/20;
				temp=temp%20;
			}
			else if(temp>=10) {
				tenRupeesCount+=temp/10;
				temp=temp%10;
			}
			else {
				fiveRupeesCount+=temp/5;
				temp=temp%5;
			}
			System.out.println(temp);
		}
		
		
		if(fiftyRupeesCount>0) {
			change+="\nFifty Rupees Cash : "+fiftyRupeesCount;
		}
		if(twentyRupeesCount>0) {
			change+="\n Twenty Rupees Cash : "+twentyRupeesCount;
		}
		if(tenRupeesCount>0) {
			change+="\n Ten Rupees Cash : "+tenRupeesCount;
		}
		if(fiveRupeesCount>0) {
			change+="\n Five Rupees Coin : "+fiveRupeesCount;
		}
			
		return change;
	}

}
