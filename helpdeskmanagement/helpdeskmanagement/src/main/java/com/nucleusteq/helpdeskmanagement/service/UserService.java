package com.nucleusteq.helpdeskmanagement.service;

import java.util.List;

import com.nucleusteq.helpdeskmanagement.dto.InputLoginDTO;
import com.nucleusteq.helpdeskmanagement.dto.UserDTO;

/**
 * @author User service interface.
 *
 */
public interface UserService {

    /**
     * @param userDTO user dto.
     */
    void register(UserDTO userDTO);

    /**
     * @return UserDTO.
     */
    List<UserDTO> findAllUsers();

    /**
     * @param inputLoginDTO input login.
     * @return fetchUserByEmail.
     */
    UserDTO fetchUserByEmail(InputLoginDTO inputLoginDTO);

    /**
     * @param userDTO userDTO
     */
    void empregister(UserDTO userDTO);

    /**
     * @return useDTO.
     */
    List<UserDTO> findAllAdminUsers();

}
