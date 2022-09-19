package org.example.elevator;

import org.example.passengers.Passengers;
import java.util.ArrayList;
import java.util.List;

public class Elevator implements IElevator {
    private final int maxCapacity = 5;
    private int startFloor;
    /*he elevator starts moving.gets the right floor.
      clears the list of passengers after reaching the desired floor.
     */
    @Override
    public void move(List<Passengers> passengersForCheck) {
        List<Passengers> passengers = canMove(passengersForCheck);
        int c= passengers.size()-1;
        int step=0;
        for(int i = c; i>=0;i--){
            step++;
        System.out.println("startFloor = " + startFloor);
        System.out.println("Elevator move");
        startFloor = passengers.get(i).getDestination();
        System.out.println("step " + step);
        System.out.println("elevator arrived on Floor : " + passengers.get(i).getDestination());
        System.out.println("passenger with destination floor "+ passengers.get(i).getDestination()+ "  left the elevator");
        passengers.remove(i);
        System.out.println("--------------------------------------");
        }
    }
    /*checking if the elevator can move.
     create a new list of equals 5.
     check if the capacity adds to the number of people in the list.
     if it attaches, then create a new list of passengers by deleting to the required number.
     return list.
     */

    @Override
    public List<Passengers> canMove(List<Passengers> passengers) {
        List<Passengers> checkingPassenger= new ArrayList<>(5);
        if (passengers.size() > maxCapacity) {
            System.out.println("The elevator is overloaded");
            System.out.println(passengers.toArray().length);
            int n =  (passengers.toArray().length)-maxCapacity;
            for (int i = 0; i <= n; i++) {
                checkingPassenger.add(passengers.get(i));
                passengers.remove(i);
            }
            return checkingPassenger;
        }return passengers ;
    }
}
