package com.nucleusteq.inventorymanagementbeta.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Inventory Management User Entity Class
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class UsersEntitiy {
     /**
     * id is for userId.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /**
     * for user first Name.
     */
    @Column(name = "firstName")
    private String firstName;
    /**
     * for user last Name.
     */
    @Column(name = "lastName")
    private String lastName;
    /**
     * for user employee ID.
     */
    @Column(name = "employeeId")
    private String employeeId;
    /**
     * for user Emial.
     */
    @Column(name = "email")
    private String email;
    /**
     * for user password.
     */
    @Column(name = "password")
    private String password;
    /**
     * for user date of birth.
     */
    @Column(name = "dateOfBirth")
    private String dateOfBirth;
    /**
     * for user contact number.
     */
    @Column(name = "contact")
    private String contact;
    /**
     * user desigantation.
     */
    @Column(name = "desiganation")
    private String desiganation;
    /**
     * user date of joining.
     */
    @Column(name = "dateOfJoining")
    private String dateOfJoining;
    /**
     * user date of exit.
     */
    @Column(name = "dateOfExit")
    private String dateOfExit;
    /**
     * user role what it is admin or Employee.
     */
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;
    /**
     * update time.
     */
    @Column(name = "updated_at")
    private String updatedAt;
    /**
     * created time.
     */
    @Column(name = "created_at")
    private String createdAt;
}
