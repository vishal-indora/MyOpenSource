import api.TaskResource;
import com.google.inject.Guice;
import com.google.inject.Injector;
import controller.MyConfiguration;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Environment;
import module.AppModule;

public class ToDoApplication extends Application<MyConfiguration> {
    public static void main(String[] args) throws Exception {
        new ToDoApplication().run(args);
    }

    @Override
    public void run(MyConfiguration myConfiguration, Environment environment) {
        Injector injector = Guice.createInjector(new AppModule());

        final TaskResource taskResource = injector.getInstance(TaskResource.class);
        environment.jersey().register(taskResource);
    }
}
