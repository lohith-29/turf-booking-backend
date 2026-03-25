package com.example.turfbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.turfbooking.repository.TurfRepository;
import com.example.turfbooking.entity.Turf;
import java.util.List;

@Service
public class TurfService {

    @Autowired
    private TurfRepository turfRepository;

    public List<Turf> getAllTurfs() {
        return turfRepository.findAll();
    }
}