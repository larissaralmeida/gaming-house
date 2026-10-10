package com.game.gaminghouse.station;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.*;

public class StationServiceTest {

    @Test
    public void shouldCreateStationWhenCodeDoesNotExist() {

        StationRepository repository = mock(StationRepository.class);
        StationService service = new StationService(repository);

        Station station = new Station(
                "PC-01",
                StationType.PC,
                StationCondition.ACTIVE
        );

        when(repository.existsByCode("PC-01")).thenReturn(false);
        Mockito.when(repository.save(station)).thenReturn(station);

        Station result = service.createStation(station);

        verify(repository).save(station);

        assertSame(station, result);

    }
}
