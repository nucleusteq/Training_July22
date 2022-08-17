package com.nt.trainign.VendingMachineSpringBootJPAApplication.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.trainign.VendingMachineSpringBootJPAApplication.model.VendingMachine;



public interface VendingMachineRepository extends JpaRepository<VendingMachine,Integer> {
	
}
