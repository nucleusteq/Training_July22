package com.nt.training.VendingMachine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.training.VendingMachine.entities.Items;
@Repository
public interface MachineRepository extends JpaRepository<Items, Integer> {
	
	

}
