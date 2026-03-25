package com.example.turfbooking.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("userId")
    @Column(name = "user_id")
    private Long userId;

    @JsonProperty("turfId")
    @Column(name = "turf_id")
    private Long turfId;

    @JsonProperty("bookingDate")
    @Column(name = "booking_date")
    private String bookingDate;

    @JsonProperty("timeSlot")
    @Column(name = "time_slot")
    private String timeSlot;

    @JsonProperty("totalAmount")
    @Column(name = "total_amount")
    private int totalAmount;

    // getters and setters
    public Long getId() { return id; }
    public Long getUserId() { return userId; }
    public Long getTurfId() { return turfId; }
    public String getBookingDate() { return bookingDate; }
    public String getTimeSlot() { return timeSlot; }
    public int getTotalAmount() { return totalAmount; }

    public void setId(Long id) { this.id = id; }
    public void setUserId(Long userId) { this.userId = userId; }
    public void setTurfId(Long turfId) { this.turfId = turfId; }
    public void setBookingDate(String bookingDate) { this.bookingDate = bookingDate; }
    public void setTimeSlot(String timeSlot) { this.timeSlot = timeSlot; }
    public void setTotalAmount(int totalAmount) { this.totalAmount = totalAmount; }
}