package ie.atu.sample.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record BookingRequest(@NotBlank String name, @NotNull int id,@NotNull int count) {

}
