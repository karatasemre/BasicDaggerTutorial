package emre.com.basicdaggertutorial;

import android.app.Application;

import emre.com.basicdaggertutorial.di.AppComponent;
import emre.com.basicdaggertutorial.di.AppModule;
import emre.com.basicdaggertutorial.di.DaggerAppComponent;

/**
 * Created by Emre.Karatas on 11.10.2018.
 */

public class Dagger2Application extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initializeInjector();
    }

    private void initializeInjector(){
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
