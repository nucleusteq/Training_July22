package com.nucleusteq.helpdeskmanagement.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.nucleusteq.helpdeskmanagement.dto.InputLoginDTO;
import com.nucleusteq.helpdeskmanagement.dto.UserDTO;
import com.nucleusteq.helpdeskmanagement.entity.Role;
import com.nucleusteq.helpdeskmanagement.entity.User;
import com.nucleusteq.helpdeskmanagement.exception.ValidationException;
import com.nucleusteq.helpdeskmanagement.repository.UserRepository;
import com.nucleusteq.helpdeskmanagement.service.UserService;

/**
 * @author user service implementation.
 *
 */
@Service
public final class UserServiceImpl implements UserService {

    /**
     * user repository.
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * UserDTO.
     */
    @Override
    public void register(final UserDTO userDTO) {
        if (StringUtils.isEmpty(userDTO.getEmail())) {
            throw new ValidationException("Email cannot be empty.");
        } else if (userRepository.findByEmail(userDTO.getEmail()).isPresent()) {
            throw new ValidationException("Email Already Exist.");
        }

        User user = new User();

        if (Objects.equals(userDTO.getRole(),Role.ADMIN)) {
            user.setRole(Role.ADMIN);
        } else {
            user.setRole(Role.EMPLOYEE);
        }

        user.setContact(userDTO.getContact());
        user.setDob(userDTO.getDob());
        user.setEmail(userDTO.getEmail());
        user.setGender(userDTO.getGender());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setPassword(userDTO.getPassword());

        userRepository.save(user);
    }

    /**
     * find all users.
     */
    @Override
    public List<UserDTO> findAllUsers() {
        List<User> userList = userRepository.findAll();

        List<UserDTO> userDTOList = userList.stream().map(user -> {
            UserDTO u = new UserDTO();
            u.setContact(user.getContact());
            u.setDob(user.getDob());
            u.setEmail(user.getEmail());
            u.setGender(user.getGender());
            u.setFirstName(user.getFirstName());
            u.setLastName(user.getLastName());
            u.setId(user.getId());
            u.setRole(user.getRole());
            return u;
        }).collect(Collectors.toList());
        return userDTOList;
    }

    /**
     * @param inputLoginDTO input login DTO
     * @return UserDTO login implementation.
     */
    public UserDTO fetchUserByEmail(final InputLoginDTO inputLoginDTO) {
        if (StringUtils.isEmpty(inputLoginDTO.getEmail()) || StringUtils.isEmpty(inputLoginDTO.getPassword())) {
            throw new ValidationException("Email or password cannot be empty");
        }
        User user = userRepository.findByEmail(inputLoginDTO.getEmail())
                .orElseThrow(() -> new ValidationException("User not found."));
     //  String decodedPassword = new String(Base64.getDecoder().decode(user.getPassword().getBytes()));

        if (!Objects.equals(user.getPassword(), inputLoginDTO.getPassword())) {
            throw new ValidationException("Incorrect Username & Password");
        }

        // obj = new obj();
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setContact(user.getContact());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setGender(user.getGender());
        userDTO.setRole(user.getRole());
        userDTO.setLastName(user.getLastName());
        return userDTO;
    }

    /**
     * userDTO.
     */
    @Override
    public void empregister(final UserDTO userDTO) {
        if (StringUtils.isEmpty(userDTO.getEmail())) {
            throw new ValidationException("Email cannot be empty.");
        } else if (userRepository.findByEmail(userDTO.getEmail()).isPresent()) {
            throw new ValidationException("Email Already Exist.");
        }

        User user = new User();
        user.setRole(Role.EMPLOYEE);

        user.setContact(userDTO.getContact());
        user.setDob(userDTO.getDob());
        user.setEmail(userDTO.getEmail());
        user.setGender(userDTO.getGender());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setPassword(userDTO.getPassword());

        userRepository.save(user);
    }

    /**
     * find all admin users.
     */
    @Override
    public List<UserDTO> findAllAdminUsers() {
        return userRepository.findAllByRole(Role.ADMIN).stream().map(user -> {
            UserDTO u = new UserDTO();
            u.setContact(user.getContact());
            u.setDob(user.getDob());
            u.setEmail(user.getEmail());
            u.setGender(user.getGender());
            u.setFirstName(user.getFirstName());
            u.setLastName(user.getLastName());
            u.setId(user.getId());
            u.setRole(user.getRole());
            return u;
        }).collect(Collectors.toList());
    }

}
