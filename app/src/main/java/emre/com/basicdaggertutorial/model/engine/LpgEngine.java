package emre.com.basicdaggertutorial.model.engine;

import android.util.Log;

import emre.com.basicdaggertutorial.model.Engine;

/**
 * Created by Emre.Karatas on 11.10.2018.
 */

public class LpgEngine implements Engine {
    @Override
    public void turnOn() {
        Log.e("DaggerExample", "Lpg Engine turnOn");

    }

    @Override
    public void turnOff() {
        Log.e("DaggerExample", "Lpg Engine turnOff");

    }
}
