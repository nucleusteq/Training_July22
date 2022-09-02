package com.nucleusteq.inventorymanagementbeta.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import com.nucleusteq.inventorymanagementbeta.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author NucleusTeq Device
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersDto {
    /**
    * id is for userId.
    */
   private int id;
   /**
    * for user first Name.
    */
   private String firstName;
   /**
    * for user last Name.
    */
   private String lastName;
   /**
    * for user employee ID.
    */
   private String employeeId;
   /**
    * for user Emial.
    */
   private String email;
   /**
    * for user password.
    */
   private String password;
   /**
    * for user date of birth.
    */
   private String dateOfBirth;
   /**
    * for user contact number.
    */
   private String contact;
   /**
    * user desigantation.
    */
   private String desiganation;
   /**
    * user date of joining.
    */
   private String dateOfJoining;
   /**
    * user date of exit.
    */
   private String dateOfExit;
   /**
    * user role what it is admin or Employee.
    */
   @Enumerated(EnumType.STRING)
   private Role role;
   /**
    * update time.
    */
   private String updatedAt;
   /**
    * created time.
    */
   private String createdAt;
}
