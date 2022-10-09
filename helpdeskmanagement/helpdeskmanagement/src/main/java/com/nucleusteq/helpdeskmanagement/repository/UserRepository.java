package com.nucleusteq.helpdeskmanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nucleusteq.helpdeskmanagement.entity.Role;
import com.nucleusteq.helpdeskmanagement.entity.User;

/**
 * @author User Repository interface.
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>  {

    /**
     * @param email query for select user by email.
     * @return email.
     */
    @Query("SELECT u FROM User u WHERE u.email = :email")
    Optional<User> findByEmail(@Param("email") String email);

    /**
     * @param role role.
     * @return role.
     */
    @Query("SELECT u FROM User u WHERE u.role = :role")
    List<User> findAllByRole(@Param("role") Role role);


}


