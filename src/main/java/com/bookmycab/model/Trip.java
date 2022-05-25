package com.bookmycab.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tripId;

    @JsonIgnore
    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    @NotNull
    private Customer customer;

    @JsonIgnore
    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    @NotNull
    private Driver driver;
    @NotNull
    private String fromLocation;
    @NotNull
    private String toLocation;
    private LocalDateTime fromDateTime;
    private LocalDateTime toDateTime;

    private Boolean status;
    @NotNull
    @Min(1)
    private Double distanceInKm;
    @NotNull
    private Double bill;
}
