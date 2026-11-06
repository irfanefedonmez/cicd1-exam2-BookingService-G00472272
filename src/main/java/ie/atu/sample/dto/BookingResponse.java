package ie.atu.sample.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookingResponse {
    @NotBlank(message = ("Booking doesnt exists"))
    int id;
    @NotNull
    String name;
    @Max(value = 20,message = "too many people")
    int count;
    @NotNull
    Long roomId;
    @NotNull
    boolean status;
}
