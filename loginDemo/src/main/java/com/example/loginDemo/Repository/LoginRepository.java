package com.example.loginDemo.Repository;

// import java.util.Optional;

import com.example.loginDemo.Entity.LoginEntity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends JpaRepository<LoginEntity, Long> {
    
    // Optional<LoginEntity> findByUsername(String username);

    // boolean existsByUsername(String username);

    public LoginEntity findByEmail(String email);

    Optional<LoginEntity> findById(Long id);
}
