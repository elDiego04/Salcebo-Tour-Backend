package com.salcebotour.repository;

import com.salcebotour.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    List<User> findByLastNameContainingIgnoreCase(String lastName);
    List<User> findByRoleId(Long roleId);

}
