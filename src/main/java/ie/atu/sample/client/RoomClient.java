package ie.atu.sample.client;

import ie.atu.sample.dto.BookingResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cicd1-exam2_RoomService",url = "localhost:8082")

public interface RoomClient {
    @GetMapping("/api/rooms/{id}")
    BookingResponse getBookingById(@PathVariable("id") int id);
}
