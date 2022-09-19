package org.example;

import org.example.building.Building;
import org.example.building.Floor;
import org.example.elevator.Elevator;
import org.example.passengers.Passengers;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        int min=5;
        int max = 20;


        List<Floor> floorList = Building.built(min,max).getBuilding();
        List<Passengers> passengerList = Passengers.passenger(max);
        Elevator elevator = new Elevator();

//        elevator.setStartFloor(5); // set start position for elevator index list +1 ---make random;

        while (!passengerList.isEmpty()){
        floorList.get(0).callElevatorDown(elevator,passengerList, 1);
        }
        System.out.println("********************");
        for (Passengers p:passengerList) {
            System.out.println(p.getDestination());
        }


    }
}