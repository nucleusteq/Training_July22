package com.nucleusteq.helpdeskmanagement.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author nucleusteq.
 */
public final class SubCategoryDTO {

    /**
     * id.
     */
    private Long id;
    /**
     * categoryName.
     */
    private String categoryName;

    /**
     * parentCategory.
     */
    @JsonIgnore
    private CategoryDTO parentCategory;

    /**
     * @return id.
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id id.
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * @return categoryName.
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName categoryName.
     */
    public void setCategoryName(final String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return parentCategory.
     */
    public CategoryDTO getParentCategory() {
        return parentCategory;
    }

    /**
     * @param parentCategory parentCategory.
     */
    public void setParentCategory(final CategoryDTO parentCategory) {
        this.parentCategory = parentCategory;
    }

    /**
     * @param id             id.
     * @param categoryName   categoryName.
     * @param parentCategory parentCategory.
     */
    public SubCategoryDTO(final Long id, final String categoryName, final CategoryDTO parentCategory) {
        this.id = id;
        this.categoryName = categoryName;
        this.parentCategory = parentCategory;
    }

    /**
     * subCategoryDTO.
     */
    public SubCategoryDTO() {
    }
}
