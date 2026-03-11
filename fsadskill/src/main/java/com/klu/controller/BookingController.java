package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.model.Bookingmodel;
import com.klu.service.Bookingservice;

@RestController
@RequestMapping("/booking")
public class BookingController 
{

    @Autowired
    Bookingservice service;

    @PostMapping("/add")
    public Bookingmodel addBooking(@RequestBody Bookingmodel booking)
    {
        return service.addBooking(booking);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBooking(@PathVariable int id)
    {
        service.deleteBooking(id);
        return "Booking Deleted Successfully";
    }
}