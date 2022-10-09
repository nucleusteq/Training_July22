package com.nucleusteq.helpdeskmanagement.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "ticket")
public final class Ticket {

    /**
     * id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * category.
     */
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    /**
     * subCategory.
     */
    @ManyToOne
    @JoinColumn(name = "sub_category_id")
    private SubCategory subCategory;
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
    @Enumerated(EnumType.STRING)
    private TicketPriorityEnum priority;
    /**
     * status.
     */
    @Enumerated(EnumType.STRING)
    private TicketStatusEnum status;

    /**
     * assignTo.
     */
    @ManyToOne
    @JoinColumn(name = "assign_to_id")
    private User assignTo;

    /**
     * raised by.
     */
    @ManyToOne
    @JoinColumn(name = "raised_by_id")
    private User raisedBy;

    /**
     * @return raisedBy.
     */
    public User getRaisedBy() {
        return raisedBy;
    }

    /**
     * @param raisedBy raisedBy.
     */
    public void setRaisedBy(final User raisedBy) {
        this.raisedBy = raisedBy;
    }

    /**
     * @return category.
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category category
     */
    public void setCategory(final Category category) {
        this.category = category;
    }

    /**
     * @return subCategory.
     */
    public SubCategory getSubCategory() {
        return subCategory;
    }

    /**
     * @param subCategory subCategory.
     */
    public void setSubCategory(final SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    /**
     * @return description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description description.
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
     * @param requiredDate requiredDate.
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
     * @return assignTo.
     */
    public User getAssignTo() {
        return assignTo;
    }

    /**
     * @param assignTo assignTo
     */
    public void setAssignTo(final User assignTo) {
        this.assignTo = assignTo;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return "Ticket [catagory=" + category + ", subCatgory=" + subCategory + ", description=" + description
                + ", creationDate=" + creationDate + ", resolveDate=" + resolveDate + ", requiredDate=" + requiredDate
                + ", priority=" + priority + ", status=" + status + "]";
    }

    /**
     * @param catagory     category.
     * @param subCatgory   subCategory.
     * @param description  description.
     * @param creationDate creationDate.
     * @param resolveDate  resolveDate.
     * @param requiredDate requiredDate.
     * @param priority     priority.
     * @param status       status.
     */
    public Ticket(final Category catagory, final SubCategory subCatgory, final String description,
            final LocalDateTime creationDate, final LocalDate resolveDate, final LocalDate requiredDate,
            final TicketPriorityEnum priority, final TicketStatusEnum status) {
        super();
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
     * ticket.
     */
    public Ticket() {
        super();
    }

}
