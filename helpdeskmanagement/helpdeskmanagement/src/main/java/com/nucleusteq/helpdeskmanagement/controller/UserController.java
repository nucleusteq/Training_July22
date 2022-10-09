package com.nucleusteq.helpdeskmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nucleusteq.helpdeskmanagement.dto.InputLoginDTO;
import com.nucleusteq.helpdeskmanagement.dto.UserDTO;
import com.nucleusteq.helpdeskmanagement.service.UserService;

/**
 * main controller.
 */
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public final class UserController {
    /**
     * User service.
     */
    @Autowired
    private UserService userService; // instance variable

    /**
     * @param userDTO user dto.
     */
    @PostMapping("/register") // register method
    public ResponseEntity<String> register(@RequestBody final UserDTO userDTO) {
        userService.register(userDTO);
        return ResponseEntity.ok("User has been created.");
    }

    /**
     * @return userService.
     */
    @GetMapping("/get-all-users")
    public List<UserDTO> getAllUsers() {
        return userService.findAllUsers();
    }

    /**
     * @param inputLoginDTO input login dto.
     * @return userService.
     */
    @PostMapping("/login")
    public UserDTO login(@RequestBody final InputLoginDTO inputLoginDTO) {
        return userService.fetchUserByEmail(inputLoginDTO);
    }

    /**
     * @param userDTO user dto.
     */
    @PostMapping("/empregister") // register method
    public void empregister(@RequestBody final UserDTO userDTO) {
        userService.empregister(userDTO);
    }

    /**
     * @return ResponseEntity.
     */
    @GetMapping("/getalladmin")
    public ResponseEntity<List<UserDTO>> getAllAdmin() {
        return ResponseEntity.ok(userService.findAllAdminUsers());
    }

}
