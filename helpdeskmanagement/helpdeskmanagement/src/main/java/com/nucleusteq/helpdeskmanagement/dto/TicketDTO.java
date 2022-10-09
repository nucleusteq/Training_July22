package com.nucleusteq.helpdeskmanagement.dto;

import com.nucleusteq.helpdeskmanagement.entity.TicketPriorityEnum;
import com.nucleusteq.helpdeskmanagement.entity.TicketStatusEnum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author nucleusteq.
 */
public final class TicketDTO {

    /**
     * id.
     */
    private Long id;
    /**
     * category.
     */
    private CategoryDTO category;
    /**
     * subCategory.
     */
    private SubCategoryDTO subCategory;
    /**
     * description.
     */
    private String description;
    /**
     * creationDate.
     */
    private LocalDateTime creationDate;
    /**
     * resolveDate.
     */
    private LocalDate resolveDate;
    /**
     * requiredDate.
     */
    private LocalDate requiredDate;
    /**
     * priority.
     */
    private TicketPriorityEnum priority;
    /**
     * status.
     */
    private TicketStatusEnum status;

    /**
     * assignTo.
     */
    private UserDTO assignTo;

    private UserDTO raisedBy;

    public UserDTO getRaisedBy() {
        return raisedBy;
    }

    public void setRaisedBy(UserDTO raisedBy) {
        this.raisedBy = raisedBy;
    }

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
     * @return category.
     */
    public CategoryDTO getCategory() {
        return category;
    }

    /**
     * @param category category
     */
    public void setCategory(final CategoryDTO category) {
        this.category = category;
    }

    /**
     * @return subCategory.
     */
    public SubCategoryDTO getSubCategory() {
        return subCategory;
    }

    /**
     * @param subCategory subCategory.
     */
    public void setSubCategory(final SubCategoryDTO subCategory) {
        this.subCategory = subCategory;
    }

    /**
     * @return description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * @return creationDate.
     */
    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate creationDate.
     */
    public void setCreationDate(final LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return resolveDate.
     */
    public LocalDate getResolveDate() {
        return resolveDate;
    }

    /**
     * @param resolveDate resolveDate.
     */
    public void setResolveDate(final LocalDate resolveDate) {
        this.resolveDate = resolveDate;
    }

    /**
     * @return requiredDate.
     */
    public LocalDate getRequiredDate() {
        return requiredDate;
    }

    /**
     * @param requiredDate required date.
     */
    public void setRequiredDate(final LocalDate requiredDate) {
        this.requiredDate = requiredDate;
    }

    /**
     * @return priority.
     */
    public TicketPriorityEnum getPriority() {
        return priority;
    }

    /**
     * @param priority priority.
     */
    public void setPriority(final TicketPriorityEnum priority) {
        this.priority = priority;
    }

    /**
     * @return status.
     */
    public TicketStatusEnum getStatus() {
        return status;
    }

    /**
     * @param status status.
     */
    public void setStatus(final TicketStatusEnum status) {
        this.status = status;
    }

    /**
     * @return assignTo.
     */
    public UserDTO getAssignTo() {
        return assignTo;
    }

    /**
     * @param assignTo assignTO.
     */
    public void setAssignTo(final UserDTO assignTo) {
        this.assignTo = assignTo;
    }

    /**
     * @param ticketID     ticketID.
     * @param catagory     category.
     * @param subCatgory   subCategory.
     * @param description  description.
     * @param creationDate creationDate.
     * @param resolveDate  resolveDate.
     * @param requiredDate requiredDate.
     * @param priority     priority.
     * @param status       status.
     */
    public TicketDTO(final Long ticketID, final CategoryDTO catagory, final SubCategoryDTO subCatgory,
            final String description, final LocalDateTime creationDate, final LocalDate resolveDate,
            final LocalDate requiredDate, final TicketPriorityEnum priority, final TicketStatusEnum status) {
        super();
        this.id = ticketID;
        this.category = catagory;
        this.subCategory = subCatgory;
        this.description = description;
        this.creationDate = creationDate;
        this.resolveDate = resolveDate;
        this.requiredDate = requiredDate;
        this.priority = priority;
        this.status = status;
    }

    /**
     * ticketDTO.
     */
    public TicketDTO() {
        super();
    }

    /**
     * hashcode.
     */
    /**
     *
     */
    @Override
    public int hashCode() {
        return Objects.hash(assignTo, category, creationDate, description, id, priority, requiredDate, resolveDate,
                status, subCategory);
    }

    /**
     * equals.
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        TicketDTO other = (TicketDTO) obj;
        return Objects.equals(assignTo, other.assignTo) && Objects.equals(category, other.category)
                && Objects.equals(creationDate, other.creationDate) && Objects.equals(description, other.description)
                && Objects.equals(id, other.id) && priority == other.priority
                && Objects.equals(requiredDate, other.requiredDate) && Objects.equals(resolveDate, other.resolveDate)
                && status == other.status && Objects.equals(subCategory, other.subCategory);
    }

    /**
     * to string.
     */
    @Override
    public String toString() {
        return "TicketDTO [id=" + id + ", category=" + category + ", subCategory=" + subCategory + ", description="
                + description + ", creationDate=" + creationDate + ", resolveDate=" + resolveDate + ", requiredDate="
                + requiredDate + ", priority=" + priority + ", status=" + status + ", assignTo=" + assignTo + "]";
    }

}
