package com.example.loginDemo.Repository;

import com.example.loginDemo.Entity.LoginEntity;

import java.util.List;

// import java.util.Optional;

// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<LoginEntity, String> {
    
    // Optional<LoginEntity> findByUsername(String username);

    // boolean existsByUsername(String username);

    // public Optional<LoginEntity> findByEmail(String email);

    // Optional<LoginEntity> findById(Long id);

    public LoginEntity findByUserNameAndPassword(String userName, String password);

    List<LoginEntity> findByUserName(String userName);

    // Optional<LoginEntity> findByEmail(String email);
    // Optional<LoginEntity> findByPasswordOrEmail(String password, String email);
    // Optional<LoginEntity> findByPassword(String password);
    // Boolean existsByPassword(String password);
    // Boolean existsByEmail(String email);
}
