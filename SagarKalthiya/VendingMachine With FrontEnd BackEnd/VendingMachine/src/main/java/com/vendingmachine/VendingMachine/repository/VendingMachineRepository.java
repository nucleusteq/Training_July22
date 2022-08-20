package com.vendingmachine.VendingMachine.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.vendingmachine.VendingMachine.domain.VendingMachineDomain;

public interface VendingMachineRepository extends JpaRepository<VendingMachineDomain, Integer>{
	
	/*public List<VendingMachineDomain> getProductList();
	public List<VendingMachineDomain> getMyProduct(int peoductId , int userAmount);
	public  String getResult(Integer pId, Integer uAmount);
	*/
}
