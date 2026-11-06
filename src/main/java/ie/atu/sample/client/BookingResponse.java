package ie.atu.sample.client;

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
