package com.nucleusteq.inventorymanagementbeta.dto.mapper;

import org.springframework.stereotype.Component;
import com.nucleusteq.inventorymanagementbeta.domain.UsersEntitiy;
import com.nucleusteq.inventorymanagementbeta.dto.UsersDto;

/**
 * @author NucleusTeq Device
 */
@Component
public class UsersMapper {
    /**
     * @param usersDto : it will send data to database
     * @return : all user to user dto.
     */
    public final UsersEntitiy userDtoToUser(final UsersDto usersDto) {
        UsersEntitiy usersEntitiy = new UsersEntitiy();
        usersEntitiy.setFirstName(usersDto.getFirstName());
        usersEntitiy.setLastName(usersDto.getLastName());
        usersEntitiy.setEmployeeId(usersDto.getEmployeeId());
        usersEntitiy.setEmail(usersDto.getEmail());
        usersEntitiy.setPassword(usersDto.getPassword());
        usersEntitiy.setDateOfBirth(usersDto.getDateOfBirth());
        usersEntitiy.setContact(usersDto.getContact());
        usersEntitiy.setDesiganation(usersDto.getDesiganation());
        usersEntitiy.setDateOfJoining(usersDto.getDateOfJoining());
        usersEntitiy.setDateOfExit(usersDto.getDateOfExit());
        usersEntitiy.setRole(usersDto.getRole());
        usersEntitiy.setUpdatedAt(usersDto.getUpdatedAt());
        usersEntitiy.setCreatedAt(usersDto.getCreatedAt());
        return usersEntitiy;
    }
    /**
     * @param usersEntitiy : it will response to user.
     * @return : return user
     */
  public final UsersDto userTOUserDtoRespons(final UsersEntitiy usersEntitiy) {
        UsersDto usersDto = new UsersDto();
        usersDto.setFirstName(usersEntitiy.getFirstName());
        usersDto.setLastName(usersEntitiy.getLastName());
        usersDto.setEmployeeId(usersEntitiy.getEmployeeId());
        usersDto.setEmail(usersEntitiy.getEmail());
        usersDto.setDateOfBirth(usersEntitiy.getDateOfBirth());
        usersDto.setContact(usersEntitiy.getContact());
        usersDto.setDesiganation(usersEntitiy.getDesiganation());
        usersDto.setDateOfJoining(usersEntitiy.getDateOfJoining());
        usersDto.setDateOfExit(usersEntitiy.getDateOfExit());
        usersDto.setRole(usersEntitiy.getRole());
        usersDto.setUpdatedAt(usersEntitiy.getUpdatedAt());
        usersDto.setCreatedAt(usersEntitiy.getCreatedAt());
        return usersDto;
    }
}
