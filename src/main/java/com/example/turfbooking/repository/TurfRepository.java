package com.example.turfbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.turfbooking.entity.Turf;

public interface TurfRepository extends JpaRepository<Turf, Long> {
}