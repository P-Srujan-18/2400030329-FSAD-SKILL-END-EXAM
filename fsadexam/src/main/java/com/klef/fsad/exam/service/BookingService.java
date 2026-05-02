package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.exam.model.Booking;
import com.klef.fsad.exam.repository.BookingRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository repo;

    public Booking addBooking(Booking booking) {
        return repo.save(booking);
    }

    public String deleteBooking(Long id) {
        repo.deleteById(id);
        return "Booking Deleted";
    }
}
