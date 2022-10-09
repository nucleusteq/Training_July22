package com.nucleusteq.helpdeskmanagement.service;

import com.nucleusteq.helpdeskmanagement.entity.Category;
import com.nucleusteq.helpdeskmanagement.mapper.CategoryMapper;
import com.nucleusteq.helpdeskmanagement.repository.CategoryRepository;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CategoryServiceTest {

    @Mock
    private CategoryRepository categoryRepository;

    @Mock
    private CategoryService categoryService;

//    @Mock
//    private CategoryMapper categoryMapper;

    @Test
    public void getAllCategoryTest() {
        MockitoAnnotations.initMocks(this);

        List<Category> categoryList = Arrays
                .asList(new Category(1L, "Category 1", null),
                        new Category(1L, "Category 2", null),
                        new Category(1L, "Category 3", null));

        when(categoryRepository.findAll()).thenReturn(categoryList);

        assertEquals(0, categoryService.getAll().size());

    }

}
