package com.nt.trainign.VendingMachineSpringBootApplication.repository.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nt.trainign.VendingMachineSpringBootApplication.model.Product;
import com.nt.trainign.VendingMachineSpringBootApplication.model.VendingMachine;
import com.nt.trainign.VendingMachineSpringBootApplication.model.VendingMachineOutputModel;
import com.nt.trainign.VendingMachineSpringBootApplication.repository.VendingMachineRepository;

@Repository
public class VendingMachineRepositoryImpl implements VendingMachineRepository {
	public static VendingMachine vendingMachine;
	public VendingMachineRepositoryImpl() {
		vendingMachine=new VendingMachine();
		List<Product> products=new ArrayList<Product>();
		Product product1=new Product(1,"Coca-Cola","Sweetened soft drink",80,"06/10/2022",5);
		Product product2=new Product(2,"Sprite","Lemon and lime flavoured soft drink",85,"16/12/2022",8);
		Product product3=new Product(3,"Pepsi","Carbonated soft drink",65,"18/11/2022",9);
		Product product4=new Product(4,"Dairy Milk","Milk chocolate manufactured by Cadbury",50,"08/08/2022",5);
		Product product5=new Product(5,"Kitkat","Three layers of wafer separated and covered by an outer layer of chocolate",90,"09/09/2022",3);
		Product product6=new Product(6,"Chocos","Chocos is a breakfast cereal",60,"18/09/2023",10);
		Product product7=new Product(7,"Lassi","A creamy, frothy yogurt-based drink",15,"09/06/2023",2);
		Product product8=new Product(8,"5 Star","Is sold in a golden wrapper decorated with stars",25,"09/08/2022",1);
		Product product9=new Product(9,"Blue Lays","Potato Chips",20,"02/03/2023",5);
		Product product10=new Product(10,"Tutti Fruti","A preserve of chopped mixed fruits, often with brandy syrup",10,"02/08/2022",5);
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		products.add(product6);
		products.add(product7);
		products.add(product8);
		products.add(product9);
		products.add(product10);
		vendingMachine.setProducts(products);
	}

	@Override
	public List<Product> getAllProducts() {
		System.out.println(vendingMachine.getBalance());
		return vendingMachine.getProducts();
	}

	@Override
	public VendingMachineOutputModel sellProduct(int id,int money) {
		
		List<Product> products=vendingMachine.getProducts();
		String message="";
		HashMap<String,Integer> denomination;
		VendingMachineOutputModel vendingMachineOutputModel=new VendingMachineOutputModel();
		
		for(Product product:products) {
			if(product.getId() == id ) {
				if(product.getQuantity() > 0 && product.getPrice()<= money) {
					int machineBalance=vendingMachine.getBalance();
					vendingMachine.setBalance(machineBalance+product.getPrice());
					product.setQuantity(product.getQuantity()-1);
					denomination= calculateChange(product.getPrice(),money);
					message+="Here is your product Name: "+product.getName()+" Description: "+product.getDescription();
					
					vendingMachineOutputModel.setMessage(message);
					vendingMachineOutputModel.setPrice(product.getPrice());
					vendingMachineOutputModel.setItemId(product.getId());
					vendingMachineOutputModel.setDenomination(denomination);
				}
				else {
					if(product.getQuantity() == 0) {
						message+="Sold Out!";
						vendingMachineOutputModel.setMessage(message);
					}
					else if(product.getPrice()> money) {
						message+="Insufficient Funds, please collect your cash "+money+" INR";
						vendingMachineOutputModel.setMessage(message);
					}
				}
			}

		}
		
		return vendingMachineOutputModel;
	}

	@Override
	public HashMap<String,Integer> calculateChange(int sellingPrice, int money) {
		int fiftyRupeesCount=0;
		int twentyRupeesCount=0;
		int tenRupeesCount=0;
		int fiveRupeesCount=0;
		HashMap<String,Integer> denomination=new HashMap<String, Integer>();
		
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
			denomination.put("50", fiftyRupeesCount);
			change+="\nFifty Rupees Cash : "+fiftyRupeesCount;
		}
		if(twentyRupeesCount>0) {
			denomination.put("20", twentyRupeesCount);
			change+="\n Twenty Rupees Cash : "+twentyRupeesCount;
		}
		if(tenRupeesCount>0) {
			denomination.put("10", tenRupeesCount);
			change+="\n Ten Rupees Cash : "+tenRupeesCount;
		}
		if(fiveRupeesCount>0) {
			denomination.put("5", fiveRupeesCount);
			change+="\n Five Rupees Coin : "+fiveRupeesCount;
		}
			
		return denomination;
	}

}
