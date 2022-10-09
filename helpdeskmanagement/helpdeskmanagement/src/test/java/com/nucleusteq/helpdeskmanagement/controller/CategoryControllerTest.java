//package com.nucleusteq.helpdeskmanagement.controller;
//
//import com.nucleusteq.helpdeskmanagement.service.CategoryService;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.mock.web.MockHttpServletRequest;
//import org.springframework.mock.web.MockHttpServletResponse;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import static org.junit.Assert.assertEquals;
//
//
//@RunWith(MockitoJUnitRunner.class)
//public class CategoryControllerTest {
//
//    private static final String GET_ALL_CATEGORY = "/category/get-all";
//
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//
//    protected MockMvc mvc;
//
//    @InjectMocks
//    private CategoryService categoryService;
//
//    private static MockHttpServletRequest request;
//    private static MockHttpServletResponse response;
//
//    @Before
//    public void setUp() {
//        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//    }
//
//    @Test
//    public void getAllCategoryTest() throws Exception {
//        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(GET_ALL_CATEGORY).accept(MediaType.APPLICATION_JSON)).andReturn();
//        int status = mvcResult.getResponse().getStatus();
//        assertEquals(200, status);
//    }
//
//}
