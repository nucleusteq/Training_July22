package com.nucleusteq.helpdeskmanagement.dto;

import java.util.List;

/**
 * @author nucleusteq.
 */
public class CategoryDTO {

    /**
     * id.
     */
    private Long id;
    /**
     * categoryName.
     */
    private String categoryName;

    /**
     * SubCategory list.
     */
    private List<SubCategoryDTO> subCategoryDTOS;

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
     * @param categoryName categorName.
     */
    public void setCategoryName(final String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return subCategoryDTOS.
     */
    public List<SubCategoryDTO> getSubCategoryDTOS() {
        return subCategoryDTOS;
    }

    /**
     * @param subCategoryDTOS subCategoryDTOS.
     */
    public void setSubCategoryDTOS(final List<SubCategoryDTO> subCategoryDTOS) {
        this.subCategoryDTOS = subCategoryDTOS;
    }

    /**
     * @param id              id.
     * @param categoryName    categoryName.
     * @param subCategoryDTOS subCategoryDTOS.
     */
    public CategoryDTO(final Long id, final String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    /**
     * category dto.
     */
    public CategoryDTO() {
    }

    public CategoryDTO(Long id, String categoryName, List<SubCategoryDTO> subCategoryDTOS) {
        super();
        this.id = id;
        this.categoryName = categoryName;
        this.subCategoryDTOS = subCategoryDTOS;
    }
    
    
}
