package com.example.turfbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.turfbooking.repository.BookingRepository;
import com.example.turfbooking.entity.Booking;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking bookTurf(Booking booking) {
        return bookingRepository.save(booking);
    }
}