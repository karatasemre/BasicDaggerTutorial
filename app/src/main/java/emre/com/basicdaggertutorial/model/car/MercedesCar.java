package emre.com.basicdaggertutorial.model.car;

import android.util.Log;

import javax.inject.Inject;

import emre.com.basicdaggertutorial.model.Car;
import emre.com.basicdaggertutorial.model.Engine;

/**
 * Created by Emre.Karatas on 11.10.2018.
 */

public class MercedesCar implements Car {
    Engine engine;

    @Inject
    public MercedesCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        Log.v("DaggerExample","Mercedes Car start.");
        engine.turnOn();
    }

    @Override
    public void stop() {
        Log.v("DaggerExample","Mercedes Car stop.");
        engine.turnOff();
    }
}
