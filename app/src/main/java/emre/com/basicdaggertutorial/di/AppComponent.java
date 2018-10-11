package emre.com.basicdaggertutorial.di;

import javax.inject.Singleton;

import dagger.Component;
import emre.com.basicdaggertutorial.views.CarActivity;

/**
 * Created by Emre.Karatas on 11.10.2018.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(CarActivity carActivity);
}
