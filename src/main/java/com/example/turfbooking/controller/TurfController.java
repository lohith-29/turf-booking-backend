package com.example.turfbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.turfbooking.service.TurfService;
import com.example.turfbooking.entity.Turf;
import java.util.List;

@RestController
@RequestMapping("/api/turfs")
@CrossOrigin
public class TurfController {

    @Autowired
    private TurfService turfService;

    @GetMapping
    public List<Turf> getAllTurfs() {
        return turfService.getAllTurfs();
    }
}