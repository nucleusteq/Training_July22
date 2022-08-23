package com.nt.trainign.VendingMachineSpringBootJPAApplication.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.trainign.VendingMachineSpringBootJPAApplication.model.Product;
import com.nt.trainign.VendingMachineSpringBootJPAApplication.model.VendingMachine;
import com.nt.trainign.VendingMachineSpringBootJPAApplication.model.VendingMachineOutputModel;
import com.nt.trainign.VendingMachineSpringBootJPAApplication.repository.ProductRepository;
import com.nt.trainign.VendingMachineSpringBootJPAApplication.repository.VendingMachineRepository;
import com.nt.trainign.VendingMachineSpringBootJPAApplication.service.VendingMachineService;

@Service
public class VendingMachineServiceImpl implements VendingMachineService {

	@Autowired
	VendingMachineRepository vendingMachineRepository;
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		
		List<VendingMachine> result = vendingMachineRepository.findAll();
		List<Product> products=result.get(0).getProducts();
		return products;
	}

	@Override
	public VendingMachineOutputModel sellProduct(int id, int money) {
		Optional<Product> result=productRepository.findById(id);
		
		Product product =null;
		VendingMachine vendingMachine=null;
		VendingMachineOutputModel vendingMachineOutputModel=new VendingMachineOutputModel();
		String message="";
		HashMap<String,Integer> denomination;
		if(result.isPresent()) {
			product=result.get();
			Optional<VendingMachine> vendingMachineResult=vendingMachineRepository.findById(1);
			if(vendingMachineResult.isPresent()) {
				vendingMachine=vendingMachineResult.get();
			}
			
			if(product.getQuantity() > 0 && product.getPrice()<= money) {
				int machineBalance=vendingMachine.getBalance();
				vendingMachine.setBalance(machineBalance+product.getPrice());
				vendingMachineRepository.save(vendingMachine);
				product.setQuantity(product.getQuantity()-1);
				productRepository.save(product);
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
		else{
			throw new RuntimeException("Did not find product");
		}
		return vendingMachineOutputModel ;
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
