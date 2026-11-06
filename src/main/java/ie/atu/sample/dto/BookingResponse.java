package ie.atu.sample.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookingResponse {
    int id;
    String name;
    int count;
    Long roomId;
    boolean status;
}
