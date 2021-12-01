package org.example.vehicle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EngineTest {

    @Test
    public void engineTest(){
        Engine engine = new Engine("fewqfwqef",1000, 8.5);
        Assertions.assertFalse(engine.isWorking());
        Assertions.assertEquals("MAINTENANCE", engine.run("koewn"));

        engine.setTimeToMaintenance(1000);
        Assertions.assertTrue(engine.isWorking());
        Assertions.assertEquals("TEST_START", engine.run("TEST"));
    }
}
