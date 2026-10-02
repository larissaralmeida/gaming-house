package com.game.gaminghouse.exception;

import com.game.gaminghouse.station.StationAlreadyExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StationAlreadyExistsException.class)

        public ResponseEntity<String> handleStationAlreadyExists
        (StationAlreadyExistsException exception) {

            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body(exception.getMessage());

        }
}
