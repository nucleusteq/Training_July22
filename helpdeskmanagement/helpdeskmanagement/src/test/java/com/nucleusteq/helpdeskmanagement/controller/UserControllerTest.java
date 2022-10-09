//package com.nucleusteq.helpdeskmanagement.controller;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.nucleusteq.helpdeskmanagement.dto.InputLoginDTO;
//import com.nucleusteq.helpdeskmanagement.dto.UserDTO;
//import com.nucleusteq.helpdeskmanagement.entity.GenderEnum;
//import com.nucleusteq.helpdeskmanagement.service.UserService;
//
//@ExtendWith(MockitoExtension.class)
//class UserControllerTest {
//
//    private MockMvc mockmvc;
//
//    @Mock
//    private UserService userservice;
//
//    @InjectMocks
//    private UserController userController;
//
//    @BeforeEach
//    public void setup() {
//       this. mockmvc = MockMvcBuilders.standaloneSetup(userController).build();
//    }
//
//    @Test
//    public void testFindAlluser() throws Exception {
//
//        List<UserDTO> userDTOSList = new ArrayList<>();
//        userDTOSList.add(new UserDTO(1L, "Parth", "Waghela", "parth@gmail.com", 123456789L, GenderEnum.MALE, LocalDate.of(2000,8,4), "ROLE_ADMIN"));
//
//        when(userservice.findAllUsers()).thenReturn(userDTOSList);
//        MvcResult mvcResult = this.mockmvc.perform(get("/user/get-all-users").contentType(MediaType.APPLICATION_JSON)).andReturn();
//        int status = mvcResult.getResponse().getStatus();
//        assertEquals(200, status);
//
//    }
//    
//    @Test
//  void signin() throws Exception {
//     //   private static final GenderEnum MALE = null;
//        Integer id=1;
//        String firstName = "Parth";
//        String lastName = "Waghela";
//        String email = "parthwaghela@gmail.com";
//        GenderEnum gender;
//        Long contact = (long) 1234567;
//        String role="admin";
//        LocalDate dob = LocalDate.parse("2000-12-10");
//        String password = "123456";
//        
//         UserDTO userDTO = new UserDTO();
//         userDTO.setFirstName(firstName);
//         userDTO.setLastName(lastName);
//         userDTO.setEmail(email);
//         userDTO.setPassword(password);
//         userDTO.setRole(null);
//         userDTO.setContact(contact);
//         userDTO.setDob(dob);
//         userDTO.setId(null);
//        
//
//         InputLoginDTO loginDto = new InputLoginDTO();
//         loginDto.setEmail("parthwaghela@gmail.com");
//         loginDto.setPassword("123456");
//
//         ObjectMapper userMapper=new ObjectMapper();
//           String inputJSON = userMapper.writeValueAsString(loginDto);
//         when(userservice.login(Mockito.any())).thenReturn(userDTO);
//
//         MvcResult mvcResult = this.mockMvc.perform(post("/user/login").contentType(MediaType.APPLICATION_JSON).content(inputJSON)).andReturn();
//        int status = mvcResult.getResponse().getStatus();
//         assertEquals(2)
//    }
//}
//
