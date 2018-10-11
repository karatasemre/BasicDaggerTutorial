package emre.com.basicdaggertutorial.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import emre.com.basicdaggertutorial.Dagger2Application;
import emre.com.basicdaggertutorial.model.Car;
import emre.com.basicdaggertutorial.model.Engine;
import emre.com.basicdaggertutorial.model.car.MercedesCar;
import emre.com.basicdaggertutorial.model.engine.LpgEngine;

/**
 * Created by Emre.Karatas on 11.10.2018.
 */

@Module
public class AppModule {

    private final Dagger2Application dagger2Application;

    public AppModule(Dagger2Application dagger2Application){
        this.dagger2Application = dagger2Application;
    }

    @Provides
    @Singleton
    Dagger2Application provideApp(){
        return dagger2Application;
    }

    @Provides
    @Singleton
    Engine provideEngine(){
        return new LpgEngine();
    }

    @Provides
    @Singleton
    Car provideCar(Engine engine){
        return new MercedesCar(engine);
    }
}
