package ie.atu.sample.controller;

import ie.atu.sample.model.Booking;
import ie.atu.sample.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private final BookingService bookingService;
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable int id){
        return bookingService.getBookingById(id);
    }

    @GetMapping("/{}")
    public List<Booking> getAllBookings(){
        return bookingService.getAllBookings();
    }

    @PostMapping
    public Booking addBooking(@RequestBody Booking booking){
       return bookingService.addBooking(booking);
    }

}