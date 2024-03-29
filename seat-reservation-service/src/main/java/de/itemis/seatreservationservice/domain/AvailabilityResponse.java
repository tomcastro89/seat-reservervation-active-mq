package de.itemis.seatreservationservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvailabilityResponse {

    private String trainId;
    private int availableSeats;

}
