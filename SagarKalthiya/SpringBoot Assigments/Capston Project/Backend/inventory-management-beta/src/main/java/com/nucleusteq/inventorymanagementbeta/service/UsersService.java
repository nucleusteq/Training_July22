package com.nucleusteq.inventorymanagementbeta.service;

import com.nucleusteq.inventorymanagementbeta.dto.UsersDto;
/**
 * @author NucleusTeq Device
 */
public interface UsersService {
   /**
    * @param usersDto : used for userdto paramenter.
    */
   void userRegistration(UsersDto usersDto);
}
