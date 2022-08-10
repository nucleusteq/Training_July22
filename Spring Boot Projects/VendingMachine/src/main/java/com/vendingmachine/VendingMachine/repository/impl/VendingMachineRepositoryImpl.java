package com.vendingmachine.VendingMachine.repository.impl;

import org.springframework.stereotype.Repository;

@Repository
public class VendingMachineRepositoryImpl {
 
/*	static List<VendingMachineDomain> productLists;
	
	 public VendingMachineRepositoryImpl() {
		 productLists = new ArrayList<VendingMachineDomain>();
		 
		 productLists.add(new VendingMachineDomain(1, "Dairy Milk", 10, 10, "demo descriptions"));
		 productLists.add(new VendingMachineDomain(2, "Lays", 5, 20, "demo descriptions"));
		 productLists.add(new VendingMachineDomain(3, "Alu Bhujiya", 10, 10, "demo descriptions"));
		 productLists.add(new VendingMachineDomain(4, "Silk", 25, 10, "demo descriptions"));
		 productLists.add(new VendingMachineDomain(5, "cake", 30, 10, "demo descriptions"));
		 productLists.add(new VendingMachineDomain(6, "Babulgame", 10, 10, "demo descriptions"));
		 productLists.add(new VendingMachineDomain(7, "Penuts", 10, 10, "demo descriptions"));
		 productLists.add(new VendingMachineDomain(8, "Candy", 10, 10, "demo descriptions"));
	 }	
	
	@Override
	public List<VendingMachineDomain> getProductList() {
		// TODO Auto-generated method stub
		return productLists;
	}

	@Override
	public List<VendingMachineDomain> getMyProduct(int peoductId, int userAmount) {
		// TODO Auto-generated method stub
		int money = 0;
		String msg = "";
		System.out.println("Product id "+peoductId + " user amount"+ userAmount );
		List<VendingMachineDomain> myProduct  = new ArrayList<VendingMachineDomain>();
		
		for(VendingMachineDomain product:productLists) {
			if(product.getProductId() == peoductId) {
				int productPrice = product.getProductPrice();
				int quntity = product.getProductQuntity();
				
				if(userAmount >= productPrice) {
					if(quntity >0) {
						int remaingAmount = userAmount-productPrice;
					    money = remaingAmount/ 5;
					    quntity--;
					    product.setProductQuntity(quntity);
						System.out.println("Remaining  INR 5*"+ money);				
						product.setProductDescription("Collect Your Remaining amount < =INR 5*"+ money +"= > "+"and Your Product "+product.getProductName());
						//msg = "Your Product is "+product.getProductName()+"and remaining amount isINR 5*"+ money;
					}else {
						product.setProductDescription("Product is not avilable take back your amount" +userAmount);
					}    
				}else {
					product.setProductDescription("Not Have Enough Money take back your amount");
				}
				
				myProduct.add(product);
			}
		}		
		
		return myProduct;
	}

	@Override
	public String getResult(Integer pId, Integer uAmount) {
		// TODO Auto-generated method stub
		return null;
	}

*/
	
}
