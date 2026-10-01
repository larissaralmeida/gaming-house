package com.game.gaminghouse.station;

import org.springframework.stereotype.Service;

@Service
public class StationService {

    private final StationRepository stationRepository;

    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public Station createStation(Station station) {

        if (stationRepository.existsByCode(station.getCode())) {
            throw new IllegalArgumentException("Station already exists!");
        }

        return stationRepository.save(station);
    }
}
