package com.nucleusteq.helpdeskmanagement.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.nucleusteq.helpdeskmanagement.dto.UserDTO;

@RunWith(SpringRunner.class)
class UserTest {
    private static final GenderEnum MALE = null;
    private static final Role ADMIN = null;
    Long id=1L;
    String firstName = "Parth";
    String lastName = "Waghela";
    String email = "parthwaghela@gmail.com";
    GenderEnum gender = MALE;
    Long contact = (long) 1234567;
    Role role=ADMIN;
    LocalDate dob = LocalDate.parse("2000-12-10");
    String password = "123456";
    
    @Test
    public void UserTest() {
    User user = new User(contact, firstName, lastName, email, contact, role, dob, password, null);  
    user.setFirstName(firstName);
    user.setLastName(lastName);
    user.setContact(contact);
    user.setEmail(email);
    user.setPassword(password);
    user.setRole(role);
    user.setId(id);
    user.setGender(gender);
    
    
    
    assertEquals(firstName,  user.getFirstName());
    assertEquals(lastName, user.getLastName());
    assertEquals(email, user.getEmail());
    assertEquals(gender, user.getGender());
    assertEquals(contact, user.getContact());
    assertEquals(password, user.getPassword());
    assertEquals(id, user.getId());
    assertEquals(role, user.getRole());
    }
    @Test
    public void testGettersAndSetters() {
        User userDto =new User();
        assertNull(userDto.getEmail());
        String email = "email";
        userDto.setEmail(email);
        assertEquals(email, userDto.getEmail());
    }
       
    @Test
    public void testToString() {
        User user = buildUserEntity(firstName,lastName, email,gender, contact, role, password, dob , role);
        String tostring = user.toString();
        assertTrue(tostring.contains("firstName=" + firstName));
        }
 
    
    @Test
    public void testEqualsAndHashCode() {
        User user =new User();
    }
    public User buildUserEntity(String firstName, String lastName, String email, GenderEnum gender, Long contact, Role role, String password, LocalDate dob, Role role2){
        User user = new User();
       user.setFirstName(firstName);
       user.setLastName(lastName);
       user.setEmail(email);
       user.setGender(gender);
       user.setContact(contact);
       user.setRole(null);
       user.setPassword(password);
       user.setDob(dob);
       user.setRole(ADMIN);
        return user;
    }
   }


