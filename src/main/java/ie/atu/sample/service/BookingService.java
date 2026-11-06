package ie.atu.sample.service;

import ie.atu.sample.model.Booking;
import ie.atu.sample.repository.BookinRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private final BookinRepository bookinRepository;

    public BookingService(BookinRepository bookinRepository) {
        this.bookinRepository = bookinRepository;
    }

    public List<Booking> getAllBookings(){
        return bookinRepository.findAll();
    }

    public Booking getBookingById(int id){
        return bookinRepository.findById(id).orElse(null);
    }

    public Booking addBooking(Booking booking){
        return bookinRepository.save(booking);
    }
}
