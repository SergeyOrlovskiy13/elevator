package org.example.building;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private List<Floor> building;

    private Building(List<Floor> building) {
        this.building = building;
    }

    public List<Floor> getBuilding() {
        return building;
    }

    public static Building built(int min, int max){

        int n= (int) ( Math.random() * (max-min) ) + min;
        List<Floor> floors = new ArrayList<>();
        for(int i=1; i<=n; i++){
           floors.add(new Floor(i));
        }
        Building building = new Building(floors);
        System.out.println("The building consists of "+ n +" floors");
        System.out.println("----------------------------------------");
        return building;
    }


}
