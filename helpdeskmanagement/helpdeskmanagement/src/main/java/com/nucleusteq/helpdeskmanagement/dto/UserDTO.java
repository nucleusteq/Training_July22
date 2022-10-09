package com.nucleusteq.helpdeskmanagement.dto;

import com.nucleusteq.helpdeskmanagement.entity.GenderEnum;
import com.nucleusteq.helpdeskmanagement.entity.Role;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author userDTO.
 *
 */
public final class UserDTO {
    /**
     * user id.
     */
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
    private String email;
    /**
     * user contact.
     */
    private Long contact;
    /**
     * user gender.
     */
    private GenderEnum gender;
    /**
     * user date of birth.
     */
    private LocalDate dob;

    /**
     * user role.
     */
    private Role role;
    /**
     * user password.
     */
    private String password;
    /**
     * employeeId.
     */
    private String employeeId;
    /**
     * designation.
     */
    private String designation;
    /**
     * city.
     */
    private String city;
    /**
     * state.
     */
    private String state;
    /**
     * country.
     */
    private String country;

    /**
     * @return employeeId.
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId employeeId.
     */
    public void setEmployeeId(final String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return designation.
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation designation.
     */
    public void setDesignation(final String designation) {
        this.designation = designation;
    }

    /**
     * @return city.
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city city.
     */
    public void setCity(final String city) {
        this.city = city;
    }

    /**
     * @return state.
     */
    public String getState() {
        return state;
    }

    /**
     * @param state state.
     */
    public void setState(final String state) {
        this.state = state;
    }

    /**
     * @return country.
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country country.
     */
    public void setCountry(final String country) {
        this.country = country;
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
     * @return firstName.
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
     * @return lastName.
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
     * @param dob date of birth.
     */
    public void setDob(final LocalDate dob) {
        this.dob = dob;
    }

    /**
     * @return password.
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
     * user DTO.
     */
    public UserDTO() {
        super();
    }

    /**
     * @return role.
     */
    public Role getRole() {
        return role;
    }

    /**
     * @param role role.
     */
    public void setRole(final Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + ", contact=" + contact + ", gender=" + gender + ", dob=" + dob + ", role=" + role + ", password="
                + password + ", employeeId=" + employeeId + ", designation=" + designation + ", city=" + city
                + ", state=" + state + ", country=" + country + "]";
    }

    public UserDTO(Long id, String firstName, String lastName, String email, Long contact, GenderEnum gender,
            LocalDate dob, Role role, String password, String employeeId, String designation, String city, String state,
            String country) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contact = contact;
        this.gender = gender;
        this.dob = dob;
        this.role = role;
        this.password = password;
        this.employeeId = employeeId;
        this.designation = designation;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, contact, country, designation, dob, email, employeeId, firstName, gender, id,
                lastName, password, role, state);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        UserDTO other = (UserDTO) obj;
        return Objects.equals(city, other.city) && Objects.equals(contact, other.contact)
                && Objects.equals(country, other.country) && Objects.equals(designation, other.designation)
                && Objects.equals(dob, other.dob) && Objects.equals(email, other.email)
                && Objects.equals(employeeId, other.employeeId) && Objects.equals(firstName, other.firstName)
                && gender == other.gender && Objects.equals(id, other.id) && Objects.equals(lastName, other.lastName)
                && Objects.equals(password, other.password) && role == other.role && Objects.equals(state, other.state);
    }

    /**
     * @param gender2 gender2.
     */
    public void setGender(final String gender2) {
        // TODO Auto-generated method stub

    }

}
