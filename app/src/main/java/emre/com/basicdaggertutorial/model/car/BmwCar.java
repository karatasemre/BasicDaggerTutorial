package emre.com.basicdaggertutorial.model.car;

import android.util.Log;

import javax.inject.Inject;

import emre.com.basicdaggertutorial.model.Car;
import emre.com.basicdaggertutorial.model.Engine;

/**
 * Created by Emre.Karatas on 11.10.2018.
 */

public class BmwCar implements Car {
    Engine engine;

    @Inject
    public BmwCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        Log.v("DaggerExample","BMW Car start.");
        engine.turnOn();
    }

    @Override
    public void stop() {
        Log.v("DaggerExample","BMW Car stop.");
        engine.turnOff();
    }
}
