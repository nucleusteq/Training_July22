package com.nt.training.vendormachine.VendingMachine.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nt.training.vendormachine.VendingMachine.model.Product;
import com.nt.training.vendormachine.VendingMachine.repository.impl.VendingMachineRepository;
@Repository
public class VendingMachineRepositoryImpl implements VendingMachineRepository{

	static List<Product> products;
	
	public VendingMachineRepositoryImpl() {
		products = new ArrayList<Product>();
		products.add(new Product (1,"Water Bottle",10,20,"A small bottle of water"));
		products.add(new Product (2,"Chocochip Cookies",10,20,"A small pack of delicious chocolate chip cookies"));
		products.add(new Product (3,"Nachos",10,35,"A pack of cornitos nacho chips (CHEESE)"));
		products.add(new Product (4,"Kurkure",10,20,"A classic masala snack made of rice and corn"));
		products.add(new Product (5,"Uncle Chips",10,20,"A classic masala/pudina snack chips"));
		products.add(new Product (6,"Munch",10,10,"A small pack of chocolate covered waffer"));
		products.add(new Product (7,"Dairy Milk Silk",10,40,"A medium sized chocolate rich in flavor"));
		products.add(new Product (8,"Red Bull",10,45,"A can of one of the world's most popular energy drinks"));
		products.add(new Product (9,"Sprite",10,30,"A can of refreshing lemony soda"));
		products.add(new Product (10,"Coke",10,30,"A can of the original recipe CocaCola"));
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public Product buyProduct(Integer id, Integer amount) {
		// TODO Auto-generated method stub
		int i=0;
		int qty;
		int amountLeft=0;
		String denomination;
		int shortAmount = 0;
		
		Product prod = new Product();
		while(products.size()>i) {
			Product p = products.get(i);
			if(id==p.getId())
			{
				if(p.getQuantity()>0) 
				{
					if(amount>=p.getPrice()) 
					{
						qty = p.getQuantity();
						p.setQuantity(qty-1);
						
						amountLeft = (amount - p.getPrice());
						denomination = calculateDenomination(amountLeft);
						
						System.out.println("Item purchased"+denomination);
						return prod;
					}
					else 
					{
						shortAmount = (p.getPrice())-amount;
						System.out.println("Not enough money, you have "+shortAmount+" Rs. less");
						break;
					}
				}
				else
				{
					System.out.println("The item of your choice is out of stock");
					break;
				}
			}
			else
			{
				System.out.println("Invalid option");
			}
			i++;
		}
		return prod;
	}
	String calculateDenomination(int amount) {
		String calculation="";
		{
	        int[] notes = new int[]{50, 20, 10, 5 };
	        int[] noteCounter = new int[4];
	      
	        for (int i = 0; i < 4; i++) {
	            if (amount >= notes[i]) {
	                noteCounter[i] = amount / notes[i];
	                amount = amount % notes[i];
	            }
	        }
	      
	        for (int i = 0; i < 4; i++) {
	            if (noteCounter[i] != 0) {
	                calculation += notes[i]+" Rs " + " x "+ noteCounter[i]+" + ";
	            }
	        }
	    }return calculation;
	}

}
