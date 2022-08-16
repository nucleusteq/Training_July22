package com.vendingmachine.VendingMachine.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vendingmachine.VendingMachine.domain.VendingMachineDomain;
import com.vendingmachine.VendingMachine.repository.VendingMachineRepository;
import com.vendingmachine.VendingMachine.service.VendingMachineService;

@Service
public class VendingMachineServiceImpl implements VendingMachineService{

	@Autowired
	VendingMachineRepository vendingMachineRepo;
	VendingMachineDomain vendingmachine;
	
	@Override
	public List<VendingMachineDomain> getResult() {
		// TODO Auto-generated method stub
		return vendingMachineRepo.findAll();
	}
	
	

	@Override
	public VendingMachineDomain addProduct(VendingMachineDomain vendingmachine) {
		// TODO Auto-generated method stub
		return vendingMachineRepo.save(vendingmachine);
	}
	
	@Override
	public HashMap<String, Object> getProduct(int peoductId, int userAmount) {
		// TODO Auto-generated method stub
		Optional<VendingMachineDomain> myProducts  = vendingMachineRepo.findById(peoductId);
		VendingMachineDomain productDetails = myProducts.get();
		HashMap<String,Object> response = new HashMap<>();
		HashMap<String,Object> denomination = new HashMap<>();
		int twenty=0;
		int ten=0;
		int five=0;
		String twnty="",tenrps="",coin="";
		int rimAmount=userAmount-productDetails.getProductPrice();
		while(rimAmount>0) {
			if(rimAmount>=20) {
				twenty+=rimAmount/20;
				rimAmount=rimAmount%20;
			}
			else if(rimAmount>=10) {
				ten+=rimAmount/10;
				rimAmount=rimAmount%10;
			}
			else {
				five+=rimAmount/5;
				rimAmount=rimAmount%5;
			}
			System.out.println(rimAmount);
		}
		
		if(twenty>0) {
			twnty+= twenty;
		}
		if(ten>0) {
			tenrps+= ten;
		}
		if(five>0) {
			coin+= five;
		}
		denomination.put("Note 20 :", twnty);
		denomination.put("Note 10 ", ten);
		denomination.put("Coin 5 ", five);
		if(userAmount >= productDetails.getProductPrice()) {
			if(productDetails.getProductQuntity()>0) {
				response.put("message", "Successfully getting Product");
				response.put("denomination", denomination);
				response.put("itemId", productDetails.getProductId());
				response.put("price", productDetails.getProductPrice());	
			}else {
				System.out.println("This Product is Sold Out");
				response.put("message", "failure to getting Product");
				response.put("denomination", "Out of Stock");
			}
		}else {
			response.put("message", "failure to getting Product");
			response.put("denomination", "Not Have Enough Money take back your amount");
			response.put("UserAmoutReturn", userAmount);
		}
		return response;
	}

	
	
	


	
	

}
