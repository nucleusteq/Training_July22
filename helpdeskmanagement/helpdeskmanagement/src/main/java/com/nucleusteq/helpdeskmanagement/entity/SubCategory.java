package com.nucleusteq.helpdeskmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author nucleusteq.
 */
@Entity
@Table(name = "sub_category")
public final class SubCategory {

    /**
     * ID.
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
     * category.
     */
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

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
     * @param categoryName categroyName.
     */
    public void setCategoryName(final String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return category.
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category category.
     */
    public void setCategory(final Category category) {
        this.category = category;
    }

    /**
     * @param id           id.
     * @param categoryName categoryName.
     * @param category     category.
     */
    public SubCategory(final Long id, final String categoryName, final Category category) {
        this.id = id;
        this.categoryName = categoryName;
        this.category = category;
    }

    /**
     * SubCategory.
     */
    public SubCategory() {
    }
}
