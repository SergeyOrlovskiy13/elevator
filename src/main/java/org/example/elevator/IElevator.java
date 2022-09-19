package org.example.elevator;

import org.example.building.Floor;
import org.example.passengers.Passengers;

import java.util.List;

public interface IElevator {
    void move(List<Passengers> passengers);


    List<Passengers> canMove(List<Passengers> passengers);
}
