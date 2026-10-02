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

    public String getCode() {
        return code;
    }

    public Long getId() {
        return id;
    }

    public StationType getType() {
        return type;
    }
    public StationCondition getCondition() {
        return condition;
    }


    public Station (String code, StationType type, StationCondition condition) {
        this.code = code;
        this.type = type;
        this.condition = condition;
    }

    public Station() {}




}
