package com.nucleusteq.helpdeskmanagement.controller;

import com.nucleusteq.helpdeskmanagement.dto.CategoryDTO;
import com.nucleusteq.helpdeskmanagement.service.CategoryService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author nucleusteq.
 */
@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public final class CategoryController {
    
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * category service.
     */
    private final CategoryService categoryService;

    /**
     * @param categoryService category service.
     */
    @Autowired
    public CategoryController(final CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    /**
     * @param categoryDTO category DTO.
     */
    @PostMapping("/create")
    public void create(final @RequestBody CategoryDTO categoryDTO) {
        logger.info("/category/create");
        categoryService.createCategory(categoryDTO); 
    }

    /**
     * @return ResponseEntity.
     */
    @GetMapping("/get-all")
    public ResponseEntity<List<CategoryDTO>> getAllCategory() {
        logger.info("/category/get-all");
        return ResponseEntity.ok(categoryService.getAll());
    }

}
