package org.example.building;

import org.example.elevator.Elevator;
import org.example.passengers.Passengers;

import java.util.List;

public class Floor {

    private int number;
    private static boolean up;
    private static boolean down;
    private final int MAX_FLOR=20; //top floor value

    public Floor(int number) {
        this.number = number;
    }
 /*
  return true if the button is pressed
  */
    public boolean callElevatorUp(Elevator elevator, List<Passengers> passengers, int destinationFloor){
        if (number>= MAX_FLOR){
            return callElevatorDown(elevator,passengers,destinationFloor);
        }
        System.out.println("You call elevator up");
       return up=true;
    }
    /*
     return true if the button is pressed
     */
    public boolean callElevatorDown(Elevator elevator, List<Passengers> passengers, int destinationFloor){
        if(number==0){
            return callElevatorUp(elevator,passengers, destinationFloor);
        }
        System.out.println("You call elevator down");
        elevator.move(passengers);
        return down=true;
    }

    @Override
    public String toString() {
        return "Floor " + number;
    }
}

