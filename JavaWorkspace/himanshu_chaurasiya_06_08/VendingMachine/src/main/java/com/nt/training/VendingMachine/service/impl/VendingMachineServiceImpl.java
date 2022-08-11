package com.nt.training.VendingMachine.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.training.VendingMachine.domain.DenominationResponse;
import com.nt.training.VendingMachine.domain.ResponseClass;
import com.nt.training.VendingMachine.domain.VendingMachine;
import com.nt.training.VendingMachine.repository.VendingMachineRepository;
import com.nt.training.VendingMachine.service.VendingMachineService;

@Service
public class VendingMachineServiceImpl implements VendingMachineService {

	@Autowired
	VendingMachineRepository vendingMachineRepository;
	
	@Override
	public List<VendingMachine> getAllProduts() {
		return vendingMachineRepository.findAll();
	}

	@Override
	public VendingMachine addProducts(VendingMachine product) {
		return vendingMachineRepository.save(product);
	}
	
	@Override
	public ResponseClass buyProduct(Integer id, Integer amount) {
		int i=0;
		int qty;
		int remainAmount = 0;
		List<DenominationResponse> denom;
		int shortAmount = 0;
		
		List<VendingMachine> vendingMachine = vendingMachineRepository.findAll();

		ResponseClass obj = new ResponseClass();
		while  (vendingMachine.size()>i) {
			VendingMachine vendMach  = vendingMachine.get(i);
			if (id == vendMach.getId()) 
			{
				if(vendMach.getQtyAvailable() > 0)
				{
					if(amount >= vendMach.getSnackPrice())
					{
						qty = vendMach.getQtyAvailable();
						vendMach.setQtyAvailable(qty-1);
						
						remainAmount = (amount - vendMach.getSnackPrice());
						denom = calculateDenom(remainAmount);
						
						obj.setStatus("Success! You bought an item.");
						obj.setDenomination(denom);
						obj.setSnackId(vendMach.getId());
						obj.setSnack(vendMach.getSnackName());
						obj.setPrice(vendMach.getSnackPrice());
						obj.setDescription(vendMach.getSnackDesc());
						vendingMachineRepository.save(vendMach);
						
						return  obj;
					}
					else 
					{
						shortAmount= (vendMach.getSnackPrice()) - amount;
						obj.setStatus("You are short in amount of Rs "+shortAmount);
						break;
					}
				}
				else 
				{	
					obj.setStatus("Sorry the product is out of stock!");
					break;
				}
			}
			else 
			{
				obj.setStatus("Wrong snack Id Selected!");
			}
			i++;
		}
		return obj;
	}
	
	
	public List<DenominationResponse> calculateDenom(int amount) {
		List<DenominationResponse> denomResponse = new ArrayList<DenominationResponse>();
		{
	        int[] notes = new int[]{20, 10, 5, 1 };
	        int[] noteCounter = new int[4];
	      
	        for (int i = 0; i < 4; i++) {
	            if (amount >= notes[i]) {
	                noteCounter[i] = amount / notes[i];
	                amount = amount % notes[i];
	            }
	        }
	      
	        for (int i = 0; i < 4; i++) {
	            if (noteCounter[i] != 0) {
	            	denomResponse.add(new DenominationResponse(notes[i],noteCounter[i]));
	            }
	        }
	    }
		return denomResponse;
	}

}
