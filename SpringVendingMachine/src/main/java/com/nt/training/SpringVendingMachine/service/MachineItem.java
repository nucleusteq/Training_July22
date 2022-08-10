package com.nt.training.SpringVendingMachine.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nt.training.SpringVendingMachine.entities.VendingMachine;


@Repository
public class MachineItem implements MachineService {
	
	List<VendingMachine> list;
	public MachineItem() {
		list=new ArrayList<>();
		list.add(new VendingMachine(1,"Lays",20,14));
		list.add(new VendingMachine(2,"Pepsi",10,5));
		list.add(new VendingMachine(3,"Coke",30,2));
		list.add(new VendingMachine(4,"Dairy MILk",60,7));
		list.add(new VendingMachine(5,"Lassi",80,12));
		
		
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
			int Rs50=0,Rs30=0,Rs10=0,Rs5=0;
			for(VendingMachine v:list)
			{
				if(v.getId()==id) 
				{
					if(v.getQuantity()==0)
					{
						return "Item is out of stock"; 
					 }
					else
						if(cash>v.getPrice()) {
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
						p="Collect your item named " +v.getName()+ " and the amount left of Rs"+rem;
						if(Rs50>0) {
							p+=" The quantity of notes given of Rs50 is" +Rs50;
							
						}
						if(Rs30>0) {
							p+=" The quantity of notes given of Rs50 is" +Rs30;
							
						}
						if(Rs10>0) {
							p+=" The quantity of notes given of Rs50 is" +Rs10;
							
						}
						if(Rs5>0) {
							p+=" The quantity of notes given of Rs50 is" +Rs5;
							
						}
						v.setQuantity(v.getQuantity()-1);
						
					}
					else {
						return "You don't have the cash to buy" +v.getName()+ "Collect your Cash";
					}
				}
			}
		}
		return p;
		}
	}
	
	
