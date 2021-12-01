package org.example.vehicle;

import lombok.Data;

@Data
public class Car {
    private final String name;
    private final int maxSpeed;
    private final Engine engine;

    private int fuel;

    public boolean start(){
        if(engine.isWorking()){
            if(fuel>0){
                engine.run("START_ENGINE");
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
