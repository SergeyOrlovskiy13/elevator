package org.example.building.factory;

import org.example.building.Floor;

public  class FloorCreator {

    public Floor buildFloor(int numberFloor){
        return new Floor(numberFloor);
    }

}
