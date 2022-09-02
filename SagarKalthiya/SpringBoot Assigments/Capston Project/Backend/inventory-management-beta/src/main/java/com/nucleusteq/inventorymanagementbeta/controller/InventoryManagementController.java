package com.nucleusteq.inventorymanagementbeta.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.nucleusteq.inventorymanagementbeta.dto.UsersDto;
import com.nucleusteq.inventorymanagementbeta.service.UsersService;
/**
 * @author NucleusTeq Device
 */
@RestController
public class InventoryManagementController {
/**
 * logger for logging.
 */
    private final Logger logger =
    LoggerFactory.getLogger(InventoryManagementController.class);
    /**
     * this is for user servie autowiring.
     */
    @Autowired
    private UsersService usersService;
    /**
     * @param msg : return msg.
     * @return : it will return msg.
     */
    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public final @ResponseBody String testMethod(final String msg) {
       /**
        * show in logger.
        */
       logger.info(msg);
       return "hello";
    }
    /**
     * @param user : user registration api
     * @return : it will retrun user is creted or not
     */
    @RequestMapping(path = "/user-registeration", method = RequestMethod.POST)
public final ResponseEntity<String> registerUser(
@RequestBody final UsersDto user) {
        usersService.userRegistration(user);
        return ResponseEntity.ok().body("User created");
    }
}
