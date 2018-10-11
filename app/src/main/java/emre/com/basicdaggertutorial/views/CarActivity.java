package emre.com.basicdaggertutorial.views;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

import emre.com.basicdaggertutorial.Dagger2Application;
import emre.com.basicdaggertutorial.R;
import emre.com.basicdaggertutorial.model.Car;

public class CarActivity extends Activity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inject();

        car.start();
        car.stop();
    }

    private void inject() {
        Dagger2Application app = (Dagger2Application) getApplication();
        app.getAppComponent().inject(this);
    }
}
