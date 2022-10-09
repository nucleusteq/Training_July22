package com.nucleusteq.helpdeskmanagement.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author user.
 *
 */
/**
 * @author Parth Waghela
 *
 */

@Entity
@Table(name = "user")
public final class User {

    /**
     * user id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * user first name.
     */
    private String firstName;
    /**
     * user last name.
     */
    private String lastName;

    /**
     * user email.
     */
    @Column(name = "email", unique = true)
    private String email;
    /**
     * user contact.
     */
    private Long contact;
    /**
     * user gender.
     */
    @Enumerated(EnumType.STRING)
    private GenderEnum gender;
    /**
     * user date of birth..
     */
    private LocalDate dob;
    /**
     * user password.
     */
    private String password;

    /**
     * role of user..
     */
    @Enumerated(EnumType.STRING)
    private Role role;

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
     * @return first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName first name.
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return getLastName.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName last name.
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email email.
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * @return contact.
     */
    public Long getContact() {
        return contact;
    }

    /**
     * @param contact contact.
     */
    public void setContact(final Long contact) {
        this.contact = contact;
    }

    /**
     * @return gender.
     */
    public GenderEnum getGender() {
        return gender;
    }

    /**
     * @param gender gender.
     */
    public void setGender(final GenderEnum gender) {
        this.gender = gender;
    }

    /**
     * @return dob.
     */
    public LocalDate getDob() {
        return dob;
    }

    /**
     * @param dob dob.
     */
    public void setDob(final LocalDate dob) {
        this.dob = dob;
    }

    /**
     * @return getPassword.
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password password.
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * @return 'role' .
     */
    public Role getRole() {
        return role;
    }

    /**
     * @param role set role.
     */
    public void setRole(final Role role) {
        this.role = role;
    }

    /**
     * @param id        id.
     * @param firstName firstName.
     * @param lastName  lastName.
     * @param email     email.
     * @param contact   contact.
     * @param role2    gender.
     * @param dob       dob.
     * @param password  password.
     * @param role      role.
     */
    public User(final Long id, final String firstName, final String lastName, final String email, final Long contact,
            final Role role2, final LocalDate dob, final String password, final Role role) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contact = contact;
        this.gender = gender;
        this.dob = dob;
        this.password = password;
        this.role = role;
    }

    /**
     * hashcode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(contact, dob, email, firstName, gender, id, lastName, password, role);
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

        User other = (User) obj;
        return Objects.equals(contact, other.contact) && Objects.equals(dob, other.dob)
                && Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
                && Objects.equals(gender, other.gender) && Objects.equals(id, other.id)
                && Objects.equals(lastName, other.lastName) && Objects.equals(password, other.password)
                && role == other.role;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + ", contact=" + contact + ", gender=" + gender + ", dob=" + dob + ", password=" + password + ", role="
                + role + "]";
    }

    /**
     * user.
     */
    public User() {
        super();
    }

}
