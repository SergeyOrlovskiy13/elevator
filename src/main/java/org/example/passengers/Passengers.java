package org.example.passengers;

import java.util.*;
import java.util.stream.Collectors;

public class Passengers  {
    private int destination;

    private Passengers(int destination) {
        this.destination = destination;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public static List<Passengers> passenger( int max){

        int k = (int) (Math.random()* (10));
        List<Passengers> passengerList = new ArrayList<>();
        for(int i =0; i <=k; i++){
            int n= (int) ( Math.random() * (max-1) ) +1;
            passengerList.add(new Passengers(i));
            passengerList.get(i).setDestination(n);
        }
        passengerList = passengerList.stream()
                .sorted(Comparator.comparingInt(Passengers::getDestination))
                .collect(Collectors.toList());
        Collections.reverse(passengerList);

            System.out.println("The list of passengers = " + (passengerList.size()));
        System.out.println("----------------------------------------");

        return passengerList;
    }



}
