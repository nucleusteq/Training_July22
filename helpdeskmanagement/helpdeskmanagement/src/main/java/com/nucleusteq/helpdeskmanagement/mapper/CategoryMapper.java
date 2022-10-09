package com.nucleusteq.helpdeskmanagement.mapper;

import com.nucleusteq.helpdeskmanagement.dto.CategoryDTO;
import com.nucleusteq.helpdeskmanagement.dto.SubCategoryDTO;
import com.nucleusteq.helpdeskmanagement.entity.Category;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author class categorymapper.
 *
 */
@Component
public class CategoryMapper {

    /**
     * @param categoryDTO category dto.
     * @return category.
     */
    public Category categoryDtoToCategory(final CategoryDTO categoryDTO) {
        Category category = new Category();
        category.setCategoryName(categoryDTO.getCategoryName());
        return category;
    }

    /**
     * @param category category.
     * @return null.
     */
    public CategoryDTO categoryToCategoryDTO(final Category category) {
        return new CategoryDTO(category.getId(), category.getCategoryName(),
                Optional.ofNullable(category.getSubCategories()).orElse(Collections.emptyList()).stream()
                        .map(sc -> new SubCategoryDTO(sc.getId(), sc.getCategoryName(), null))
                        .collect(Collectors.toList()));
    }

}
