package com.game.gaminghouse.station;

public class StationAlreadyExistsException extends RuntimeException{

    public StationAlreadyExistsException(String message){
        super(message);
    }
}
