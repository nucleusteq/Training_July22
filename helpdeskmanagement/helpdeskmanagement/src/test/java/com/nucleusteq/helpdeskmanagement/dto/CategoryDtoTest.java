package com.nucleusteq.helpdeskmanagement.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CategoryDtoTest {

    @Test
    public void CategoryTest() {

        CategoryDTO categoryDto = new CategoryDTO();
        String CategoryName = "Hardware";
        Long id = 2L;
//        String subCategoryDTOS= "Mouse";

        categoryDto.setCategoryName(CategoryName);
        categoryDto.setId(id);
//        categoryDto.setSubCategoryDTOS(List<SubCategoryDTO> subCategoryDTOS);

        assertEquals(CategoryName, categoryDto.getCategoryName());
        assertEquals(id, categoryDto.getId());
//        assertEquals(subCategoryDTOS, categoryDto.getSubCategoryDTOS());            
    }

    @Test
    public void testGetterAndSetter() {
        CategoryDTO categoryDto = new CategoryDTO();
        String CategoryName = "Hardware";
        categoryDto.setCategoryName(CategoryName);
        assertEquals(CategoryName, categoryDto.getCategoryName());
    }

    @Test
    public void testToString() {
        CategoryDTO categoryDto = new CategoryDTO();
        String CategoryName = "Hardware";
        Long id = 2L;
//        List<SubCategoryDTO> subCategoryDTOS = Mouse;

        categoryDto.setCategoryName(CategoryName);
        categoryDto.setId(id);

        CategoryDTO categoryDto1 = buildCategoryDTO(CategoryName, id);
    }

    @Test
    public void testEqualsAndHashCode() {
        CategoryDTO categoryDto1 = new CategoryDTO();
    }

    public CategoryDTO buildCategoryDTO(String CategoryName, Long id) {
        CategoryDTO categoryDto = new CategoryDTO();
        categoryDto.setCategoryName(CategoryName);
        categoryDto.setId(id);
//        categoryDto.setSubCategoryDTOS(subCategoryDTOS);

        return categoryDto;
    }

}