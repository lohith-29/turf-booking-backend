package com.example.turfbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.turfbooking.entity.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}