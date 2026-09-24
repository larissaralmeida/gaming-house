package com.game.gaminghouse.station;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, unique = true)
    private  String code;

    @NotNull
    @Enumerated(EnumType.STRING)
    private StationType type;

    @NotNull
    @Enumerated(EnumType.STRING)
    private StationCondition condition;

}
