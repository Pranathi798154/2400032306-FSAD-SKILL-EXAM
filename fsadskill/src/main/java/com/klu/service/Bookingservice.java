package com.klu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.model.Bookingmodel;
import com.klu.repository.Bookingrepository;

@Service
public class Bookingservice 
{

    @Autowired
    Bookingrepository repo;

    public Bookingmodel addBooking(Bookingmodel booking)
    {
        return repo.save(booking);
    }

    public void deleteBooking(int id)
    {
        repo.deleteById(id);
    }

}