package ie.atu.sample.controller;

import ie.atu.sample.model.Booking;
import ie.atu.sample.service.BookingService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Booking addBooking(@RequestBody Booking booking){
       return bookingService.addBooking(booking);
    }

}