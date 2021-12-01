package org.example.vehicle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CarTest {

    @Test
    public void carTest(){
        Engine engine = Mockito.mock(Engine.class);
        Car car = new Car("Porsche", 320, engine);
        Assertions.assertFalse(car.start());

        car.setFuel(100);
        Mockito.when(engine.isWorking()).thenReturn(true);
        Assertions.assertTrue(car.start());

        Mockito.when(engine.isWorking()).thenReturn(false);
        Assertions.assertFalse(car.start());

        Mockito.verify(engine, Mockito.times(1))
                .run("START_ENGINE");
    }
}
