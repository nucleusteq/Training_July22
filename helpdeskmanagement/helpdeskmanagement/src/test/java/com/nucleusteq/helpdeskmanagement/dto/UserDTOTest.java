package com.nucleusteq.helpdeskmanagement.dto;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.nucleusteq.helpdeskmanagement.entity.GenderEnum;
import com.nucleusteq.helpdeskmanagement.entity.Role;
import com.nucleusteq.helpdeskmanagement.entity.User;

@RunWith(SpringRunner.class)

public class UserDTOTest {
    private static final GenderEnum MALE = null;
    private static final Role ADMIN = null;
   
    Long id=1L;
    String firstName = "Parth";
    String lastName = "Waghela";
    String email = "parthwaghela@gmail.com";
    GenderEnum gender = MALE;
    Long contact = 1234567L;  
    LocalDate dob = LocalDate.parse("2000-12-10");
    String password = "123456";
    Role role = ADMIN;
    
	@Test
	 public void UserDTO() {

	    UserDTO userdto= new UserDTO();
	    userdto.setFirstName(firstName);
	    userdto.setLastName(lastName);
	    userdto.setEmail(email);
	    userdto.setGender(gender);
	    userdto.setContact(contact);
	    userdto.setPassword(password);
	    userdto.setDob(dob);
	    userdto.setId(id);
	    userdto.setRole(role);
	 
	 
	    assertEquals(firstName,  userdto.getFirstName());
	    assertEquals(lastName, userdto.getLastName());
	    assertEquals(email, userdto.getEmail());
	    assertEquals(gender, userdto.getGender());
	    assertEquals(contact, userdto.getContact());
	    assertEquals(password, userdto.getPassword());
	    assertEquals(dob, userdto.getDob());
	    assertEquals(id, userdto.getId());
	    assertEquals(role, userdto.getRole());
	    
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
	    UserDTO userEntity = buildUserEntity(firstName,lastName, email,gender, contact, password, dob, role);
     String tostring = userEntity.toString();
     assertTrue(tostring.contains("firstName=" + firstName));       
    }

	

    @Test
      public void testEqualsAndHashCode() {
          UserDTO userEntity =new UserDTO();
      }
      public UserDTO buildUserDto(Long id, String firstName, String lastName,
          String contact, String email, GenderEnum gender, String role, String password ,LocalDate dob)
      {
          UserDTO user = new UserDTO();
          user.setFirstName(firstName);
          user.setLastName(lastName);
          user.setEmail(email);
          user.setGender(gender);
         // user.setContact(contact);
          user.setPassword(password);
          user.setDob(dob);
          user.setRole(ADMIN);
       return user;
      }
      
      public UserDTO buildUserEntity( String firstName, String lastName, String email, GenderEnum gender, Long contact, String password, LocalDate dob, Role role) {
          UserDTO userEntity = new UserDTO();
              userEntity.setFirstName(firstName);
              userEntity.setLastName(lastName);
              userEntity.setEmail(email);
              userEntity.setGender(GenderEnum.MALE);
              userEntity.setContact(contact);
              userEntity.setPassword(password);
              userEntity.setDob(dob);
              userEntity.setRole(ADMIN);
              return userEntity;
               }

}
