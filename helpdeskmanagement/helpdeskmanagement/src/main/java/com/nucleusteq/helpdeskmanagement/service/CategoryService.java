package com.nucleusteq.helpdeskmanagement.service;

import com.nucleusteq.helpdeskmanagement.dto.CategoryDTO;

import java.util.List;


/**
 * @author nucleusteq.
 */
public interface CategoryService {

    /**
     * @param categoryDTO category DTO.
     */
    void createCategory(CategoryDTO categoryDTO);

    /**
     * @return CategoryDTO.
     */
    List<CategoryDTO> getAll();

}
