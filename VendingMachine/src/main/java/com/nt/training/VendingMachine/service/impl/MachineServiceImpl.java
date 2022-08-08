package com.nt.training.VendingMachine.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nt.training.VendingMachine.entities.Items;
import com.nt.training.VendingMachine.repository.MachineRepository;
import com.nt.training.VendingMachine.service.MachineService;

@Service
public class MachineServiceImpl implements MachineService {

	@Autowired
	private MachineRepository machineRepository;

	@Override
	public List<Items> getItems() {
		return machineRepository.findAll();
	}

	@Override
	public ResponseEntity<?> getItem(Integer itemId, Integer price) {
		Map<String, Object> response=new HashMap<String, Object>();
		Optional<Items> item= machineRepository.findById(itemId);
		if(item.isEmpty()) {
			response.put("ERROR", "PLEASE PROVIDE CORRECT ITEM ID....");
			return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
		}
		Items item2=item.get();
		
		
		if(item2.getPrice()<= price) {
			
			Integer returnAmount = price-item2.getPrice();
			if(item2.getQuantity()==1) {
				machineRepository.deleteById(item2.getId());
			}
			else {
				item2.setQuantity(item2.getQuantity()-1);
				machineRepository.save(item2);
			}
			
			response.put("ITEM PURCHASE " ,item2);
			response.put("RETURN AMOUNT ", returnAmount);
			return new ResponseEntity<>(response,HttpStatus.OK);
			
		}
		response.put("Message", "YOU DONT HAVE ENOUGH MONEY...");
	 return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);	
	}

	@Override
	public Items addItem(Items item) {
		return machineRepository.save(item);
	}

}
