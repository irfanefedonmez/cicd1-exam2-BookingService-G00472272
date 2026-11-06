package ie.atu.sample.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Setter
@Getter
@Entity
@NoArgsConstructor


public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @NotBlank
    private int id;

    @NotBlank(message = "name should be filled")
    private String name;

    @Positive(message = "number should be positive")
    private int count;

    @NotBlank
    private long roomId;

    private boolean status = true ;

    public Booking(int id, String name, int count, long roomId , boolean status) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.roomId = roomId;
        this.status = status;
    }

}
