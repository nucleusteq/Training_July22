package com.nucleusteq.helpdeskmanagement.dto;

import java.util.Objects;

/**
 * @author InputloginDto.
 *
 */
public final class InputLoginDTO {

    /**
     * EmailDto.
     */
    private String email;
    /**
     * PasswordDto.
     */
    private String password;

    /**
     * @return email.
     */
    public  String getEmail() {
        return email;
    }

    /**
     * @param email email.
     */
    public  void setEmail(final String email) {
        this.email = email;
    }

    /**
     * @return password.
     */
    public  String getPassword() {
        return password;
    }

    /**
     * @param password password.
     */
    public  void setPassword(final String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        InputLoginDTO other = (InputLoginDTO) obj;
        return Objects.equals(email, other.email) && Objects.equals(password, other.password);
    }

    public InputLoginDTO(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "InputLoginDTO [email=" + email + ", password=" + password + "]";
    }

    public InputLoginDTO() {
        super();
    }
    
}
