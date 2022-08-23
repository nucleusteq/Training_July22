package com.springboot.VendingMachine.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.VendingMachine.entities.VendingMachine;

@Repository
public class VendingMachineServiceImpl implements VendingMachineService {
	
	List<VendingMachine> list;
	public VendingMachineServiceImpl() {
		list=new ArrayList<>();
		list.add(new VendingMachine(1,"Pepsi",10,5));
		list.add(new VendingMachine(2,"Lays",20,14));
		list.add(new VendingMachine(3,"Coke",30,2));
		list.add(new VendingMachine(4,"Hersheys",40,4));
		list.add(new VendingMachine(5,"Smoodh",50,8));
		list.add(new VendingMachine(6,"Dairy MILk",60,7));
		list.add(new VendingMachine(7,"KitKat",70,9));
		list.add(new VendingMachine(8,"Lassi",80,12));
		list.add(new VendingMachine(9,"Croisant",90,34));
		list.add(new VendingMachine(10,"Bread",100,11));
		
	}
	
	@Override
	public List<VendingMachine> getVendingMachine() {
		
		return list;
	}

	@Override
	public String displayVendingMachine(int id, int cash) {
		String p=null;
		
		if(id<0 || id>10) {
			return "Not a valid id";
		}
		if(cash<=0) {
			return "invalid amount";
		
		}
		else {
			int $50=0,$30=0,$10=0,$5=0;
			for(VendingMachine v:list) {
				if(v.getId()==id) {
					if(v.getQuantity()==0) {
						return "OOPS!! Item is out of stock"; 
					}
					else if(cash>v.getPrice()) {
						int rem=cash-v.getPrice();
						cash=cash-v.getPrice();
						while(cash>=50) {
							$50 = cash/50;
							cash=cash%50;
							break;
						}
						while(cash>=20) {
							$30 = cash/30;
							cash=cash%20;
						}
						while(cash>=10) {
							$10 = cash/10;
							cash=cash%10;
						}
						while(cash>=5) {
							$5 = cash/5;
							cash=cash%5;
						}
						p="please collect your item named " +v.getName()+ " and the amount left of $"+rem;
						if($50>0) {
							p+=" The quantity of notes given of $50 is" +$50;
							
						}
						if($30>0) {
							p+=" The quantity of notes given of $50 is" +$30;
							
						}
						if($10>0) {
							p+=" The quantity of notes given of $50 is" +$10;
							
						}
						if($5>0) {
							p+=" The quantity of notes given of $50 is" +$5;
							
						}
						v.setQuantity(v.getQuantity()-1);
						
					}
					else {
						return "You don't have the cash to buy" +v.getName()+ "Please collect your Cash.Sorry!";
					}
				}
			}
		}
		return p;
		}
	}
	
	


