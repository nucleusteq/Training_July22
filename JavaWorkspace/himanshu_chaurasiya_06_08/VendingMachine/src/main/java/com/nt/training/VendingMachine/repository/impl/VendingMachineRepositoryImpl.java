//package com.nt.training.VendingMachine.repository.impl;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Repository;
//
//import com.nt.training.VendingMachine.domain.DenominationResponse;
//import com.nt.training.VendingMachine.domain.ResponseClass;
//import com.nt.training.VendingMachine.domain.VendingMachine;
//import com.nt.training.VendingMachine.repository.VendingMachineRepository;
//
//
//@Repository
//public class VendingMachineRepositoryImpl implements VendingMachineRepository{
//
//	
//
//	public VendingMachineRepositoryImpl() {
//		vendingMachine = new ArrayList<VendingMachine>();
//		vendingMachine.add(new VendingMachine(1,"Samosa",10,25,"Enjoy the flavour of Indian famous snack ."));
//		vendingMachine.add(new VendingMachine(2,"Kachori",10,10,"Flavours of many cities lies in it known as kachori ."));
//		vendingMachine.add(new VendingMachine(3,"Ice Cream",10,30,"With choice of some delicious flavours you favourite Ice Cream is here ."));
//		vendingMachine.add(new VendingMachine(4,"Dairy Milk",10,15,"Want some sweets after your lunch ? here it is !"));
//		vendingMachine.add(new VendingMachine(5,"Poha",10,5,"We all know ! Everyones choice for breakfast is poha . "));
//	}
//	
//	
//	@Override
//	public List<VendingMachine> getAllProducts() {
//		return vendingMachine;
//	}
//	
//	
//	@Override
//	public ResponseClass buyProduct(Integer id, Integer amount) {
//		int i=0;
//		int qty;
//		int remainAmount = 0;
//		List<DenominationResponse> denom;
//		int shortAmount = 0;
//
//		ResponseClass obj = new ResponseClass();
//		while  (vendingMachine.size()>i) {
//			VendingMachine vendMach  = vendingMachine.get(i);
//			if (id == vendMach.getId()) 
//			{
//				if(vendMach.getQtyAvailable() > 0)
//				{
//					if(amount >= vendMach.getSnackPrice())
//					{
//						qty = vendMach.getQtyAvailable();
//						vendMach.setQtyAvailable(qty-1);
//						
//						remainAmount = (amount - vendMach.getSnackPrice());
//						denom = calculateDenom(remainAmount);
//						
//						obj.setStatus("Success! You bought an item.");
//						obj.setDenomination(denomResponse);
//						obj.setSnackId(vendMach.getId());
//						obj.setSnack(vendMach.getSnackName());
//						obj.setPrice(vendMach.getSnackPrice());
//						obj.setDescription(vendMach.getSnackDesc());
//						
//						return  obj;
//					}
//					else 
//					{
//						shortAmount= (vendMach.getSnackPrice()) - amount;
//						obj.setStatus("You are short in amount of Rs "+shortAmount);
//						break;
//					}
//				}
//				else 
//				{	
//					obj.setStatus("Sorry the product is out of stock!");
//					break;
//				}
//			}
//			else 
//			{
//				obj.setStatus("Wrong snack Id Selected!");
//			}
//			i++;
//		}
//		return obj;
//	}
//	
//	
//	public List<DenominationResponse> calculateDenom(int amount) {
//		denomResponse = new ArrayList<DenominationResponse>();
//		{
//	        int[] notes = new int[]{20, 10, 5, 1 };
//	        int[] noteCounter = new int[4];
//	      
//	        for (int i = 0; i < 4; i++) {
//	            if (amount >= notes[i]) {
//	                noteCounter[i] = amount / notes[i];
//	                amount = amount % notes[i];
//	            }
//	        }
//	      
//	        for (int i = 0; i < 4; i++) {
//	            if (noteCounter[i] != 0) {
//	            	denomResponse.add(new DenominationResponse(notes[i],noteCounter[i]));
//	            }
//	        }
//	    }
//		return denomResponse;
//	}
//
//}
