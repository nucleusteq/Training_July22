package com.nt.training.VendingMachine.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.VendingMachine.entities.VendingMachine;

@Repository
public class VendingMachineServiceDetails implements VendingMachineService {
	
	List<items> list;
	public VendingMachineServiceDetails() {
		list=new ArrayList<>();
		list.add(new items(1,"Pepsi",10,5));
		list.add(new items(2,"coca cola",20,14));
		list.add(new items(3,"fanta",30,2));
		list.add(new items(4,"snickers",40,4));
		list.add(new items(5,"milk",50,8));
		list.add(new items(6,"Dairy MILk",60,7));
		list.add(new items(7,"KitKat",70,9));
		list.add(new items(8,"Coffee",80,12));
		list.add(new items(9,"ice-cream",90,34));
		list.add(new items(10,"Bread",100,11));
		
	}
	
	@Override
	public List<items> getVendingMachine() {
		
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
			int Rs50=0,Rs30=0,Rs10=0,Rs5=0;
			for(items v:list) {
				if(v.getId()==id) {
					if(v.getQuantity()==0) {
						return "Item is out of stock"; 
					}
					else if(cash>v.getPrice()) {
						int rem=cash-v.getPrice();
						cash=cash-v.getPrice();
						while(cash>=50) {
							Rs50 = cash/50;
							cash=cash%50;
							break;
						}
						while(cash>=20) {
							Rs30 = cash/30;
							cash=cash%20;
						}
						while(cash>=10) {
							Rs10 = cash/10;
							cash=cash%10;
						}
						while(cash>=5) {
							Rs5 = cash/5;
							cash=cash%5;
						}
						p="please collect your item named " +v.getName()+ " and the amount left of $"+rem;
						if(50>0) {
							p+=" The quantity of notes given of $50 is" +Rs50;
							
						}
						if(30>0) {
							p+=" The quantity of notes given of $50 is" +Rs30;
							
						}
						if(10>0) {
							p+=" The quantity of notes given of $50 is" +Rs10;
							
						}
						if(5>0) {
							p+=" The quantity of notes given of $50 is" +Rs5;
							
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
	
	
