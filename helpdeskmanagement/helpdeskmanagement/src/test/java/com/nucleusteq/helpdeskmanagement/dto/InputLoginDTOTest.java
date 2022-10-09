package com.nucleusteq.helpdeskmanagement.dto;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.nucleusteq.helpdeskmanagement.entity.Ticket;

@RunWith(SpringRunner.class)
public class InputLoginDTOTest {

    String email="parthwaghela@nucleusteq.com";
    String password="P@rth123"; 
    
    public Void InputLoginDTO() {
        
        InputLoginDTO inputlogindto=new InputLoginDTO();
        
        inputlogindto.setEmail(email);
        inputlogindto.setPassword(password);
        
        assertEquals(email, inputlogindto.getEmail());
        assertEquals(password, inputlogindto.getPassword());
        return null;
          
    }
    @Test
    public void testGetterAndSetters() {
        InputLoginDTO inputlogindto=new InputLoginDTO();
        assertNull(inputlogindto.getEmail());
        String email ="email";
        inputlogindto.setEmail(email);
        assertEquals(email, inputlogindto.getEmail());
        
       
        assertNull(inputlogindto.getPassword());
        String password ="P@rth123";
        inputlogindto.setPassword(password);
        assertEquals(password, inputlogindto.getPassword());
    }
    
    @Test
    public void testToString() {
       InputLoginDTO inputLogin = buildInputLoginDTO(email, password);
       String toString = inputLogin.toString();
       assertTrue(toString.contains("email=" +email));
       assertTrue(toString.contains("password=" +password));
    }
    public InputLoginDTO buildInputLoginDTO(String email , String password) {
        InputLoginDTO inputLogin= new InputLoginDTO();
        inputLogin.setEmail(email);
        inputLogin.setPassword(password);
        return inputLogin;
        
    }   
     
    @Test
    public void testEqualsAndHashCode() {
        InputLoginDTO inputLogin= new InputLoginDTO();
        
    }
  
}
