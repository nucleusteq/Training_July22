package com.training.VendingMachine.service;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.training.VendingMachine.domain.Item;

import java.util.*;

@Repository
public class ServiceImp implements VendingService {
static List<Item> items;

public  ServiceImp() {
	items = new ArrayList<Item>();
	
	items.add(new Item(1, "Coca cola",30,10));
	items.add(new Item(2, "Sprite",25,4));
	items.add(new Item(3, "Fanta",25,2));
	items.add(new Item(4, "Kurkure",10,7));
	items.add(new Item(5, "Lays",15,8));
	items.add(new Item(6, "Cookie",20,7));
	items.add(new Item(7, "Fruti",10,8));
	items.add(new Item(8, "5star",5,10));
	items.add(new Item(9, "Munch",10,7));
	items.add(new Item(10, "DiaryMilk",30,0));
}
	

	@Override
	public List<Item> getAllItem() {
		// TODO Auto-generated method stub
		return items;
	}

	@Override
	public String buyItem(Integer id,Integer cash) {
		String s="";
		if(id <=0 || id>10 || cash<=0) {
			s="Invalid id or cash amount";
			return s;
		}
		else {
		int rs50 =0,rs20=0,rs10=0,rs5=0;
		for(Item i:items) {
			if(i.getId() == id) {
				
				
			if(i.getQuantity() ==0) {
				s="Item has been souled out!";
			
			}
				else if(i.getPrice()==cash) {
				System.out.println("Collect your "+i.getName());
				i.setQuantity(i.getQuantity()-1);
				 s = "Collect your "+i.getName();
				
			}
			else if(cash>i.getPrice()) {
				int rem =cash-i.getPrice();				
				cash=cash-i.getPrice();
				while(cash>=50) {
					rs50 = cash/50;
					cash=cash%50;
					break;
				}
				while(cash>=20) {
					rs20 = cash/20;
					cash=cash%20;
				}
				while(cash>=10) {
					rs10 = cash/10;
					cash=cash%10;
				}
				while(cash>=5) {
					rs5 = cash/5;
					cash=cash%5;
				}

				s ="Collect your "+i.getName() +" And your remaning amount Rs."+rem+" in denomination \n";
				if(rs50>0)
				s+="Rs50:"+rs50+" note"+"\n" ;
				if(rs20>0)
				s+="Rs20:"+rs20+" note"+"\n" ;
				if(rs10>0)
				s+="Rs10:"+rs10+" note"+"\n" ;
				if(rs5>5)
				s+="Rs5:"+rs5+" coin"+"\n" ;
				
				i.setQuantity(i.getQuantity()-1);
			
			}
			else {
				 s ="Not enough cash to buy "+i.getName()+" Collect your money back Rs."+ cash;
			
			}
			}
		}
		
	}	
		return s;
	}
}

