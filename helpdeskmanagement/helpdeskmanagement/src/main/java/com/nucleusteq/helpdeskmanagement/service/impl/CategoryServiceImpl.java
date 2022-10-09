package com.nucleusteq.helpdeskmanagement.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nucleusteq.helpdeskmanagement.dto.CategoryDTO;
import com.nucleusteq.helpdeskmanagement.dto.SubCategoryDTO;
import com.nucleusteq.helpdeskmanagement.entity.Category;
import com.nucleusteq.helpdeskmanagement.entity.SubCategory;
import com.nucleusteq.helpdeskmanagement.repository.CategoryRepository;
import com.nucleusteq.helpdeskmanagement.repository.SubCategoryRepository;
import com.nucleusteq.helpdeskmanagement.service.CategoryService;

/**
 * @author nucleusteq.
 */
@Service
public final class CategoryServiceImpl implements CategoryService {

    /**
     * categoryRepository.
     */
    @Autowired
    private CategoryRepository categoryRepository;

    // @Autowired
//    private CategoryMapper categoryMapper;

    /**
     * subCategoryRepository.
     */
    @Autowired
    private SubCategoryRepository subCategoryRepository;

     /**
     * categoryDTO.
     */
    @Override
    public void createCategory(final CategoryDTO categoryDTO) {
        Category category = new Category();
        category.setCategoryName(categoryDTO.getCategoryName());
        Category category1 = categoryRepository.save(category);

        List<SubCategory> subCategories = Optional.ofNullable(categoryDTO.getSubCategoryDTOS())
                .orElse(Collections.emptyList()).stream().map(subCategoryDTO -> {
                    SubCategory subCategory = new SubCategory();
                    subCategory.setCategoryName(subCategoryDTO.getCategoryName());
                    subCategory.setCategory(category1);
                    return subCategory;
                }).collect(Collectors.toList());
        if (!subCategories.isEmpty()) {
            subCategoryRepository.saveAll(subCategories);
        }

    }

    /**
     * categroyDTO.
     */
    @Override
    public List<CategoryDTO> getAll() {
        List<Category> categoryList = categoryRepository.findAll();

        return categoryList.stream().map(category -> {
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setCategoryName(category.getCategoryName());
            categoryDTO.setId(category.getId());
            List<SubCategoryDTO> subCategoryDTOList = category.getSubCategories().stream().map(subCategory -> {
                SubCategoryDTO subCategoryDTO = new SubCategoryDTO();
                subCategoryDTO.setParentCategory(categoryDTO);
                subCategoryDTO.setId(subCategory.getId());
                subCategoryDTO.setCategoryName(subCategory.getCategoryName());
                return subCategoryDTO;
            }).collect(Collectors.toList());
            categoryDTO.setSubCategoryDTOS(subCategoryDTOList);
            return categoryDTO;
        }).collect(Collectors.toList());
    }
}
