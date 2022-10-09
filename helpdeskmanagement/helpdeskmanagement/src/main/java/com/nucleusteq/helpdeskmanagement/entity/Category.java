package com.nucleusteq.helpdeskmanagement.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author nucleusteq.
 */
@Entity
@Table(name = "category")
public class Category {

    /**
     * id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * categoryName.
     */
    @Column(name = "category_name")
    private String categoryName;

    /**
     * subCategory.
     */
    @OneToMany(mappedBy = "category")
    private List<SubCategory> subCategories;

    /**
     * @return id.
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id id
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
     * @return subCategories.
     */
    public List<SubCategory> getSubCategories() {
        return subCategories;
    }

    /**
     * @param subCategories subCategories.
     */
    public void setSubCategories(final List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

    public Category() {
    }

    public Category(Long id, String categoryName, List<SubCategory> subCategories) {
        this.id = id;
        this.categoryName = categoryName;
        this.subCategories = subCategories;
    }
}
