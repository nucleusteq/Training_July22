package com.nucleusteq.inventorymanagementbeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nucleusteq.inventorymanagementbeta.domain.UsersEntitiy;
/**
 * @author NucleusTeq Device
 */
@Repository
public interface UsersRepository extends JpaRepository<UsersEntitiy, Integer> {
}
