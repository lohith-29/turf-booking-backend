package com.example.turfbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.turfbooking.entity.Booking;
import com.example.turfbooking.repository.BookingRepository;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "http://localhost:3000") // allow React
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    // ✅ CREATE BOOKING
    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {

        // 🔥 DEBUG LOGS (VERY IMPORTANT)
        System.out.println("------ BOOKING REQUEST RECEIVED ------");
        System.out.println("User ID: " + booking.getUserId());
        System.out.println("Turf ID: " + booking.getTurfId());
        System.out.println("Date: " + booking.getBookingDate());
        System.out.println("Time Slot: " + booking.getTimeSlot());
        System.out.println("Amount: " + booking.getTotalAmount());
        System.out.println("--------------------------------------");

        // ❌ SAFETY CHECK (optional but useful)
        if (booking.getUserId() == null || booking.getTurfId() == null) {
            throw new RuntimeException("UserId or TurfId is NULL ❌");
        }

        // ✅ SAVE TO DATABASE
        return bookingRepository.save(booking);
    }

    // ✅ GET ALL BOOKINGS (optional)
    @GetMapping
    public java.util.List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}