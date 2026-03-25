package com.example.turfbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.turfbooking.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}