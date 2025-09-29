package module;

import com.google.inject.AbstractModule;
import dao.TaskDao;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(TaskDao.class).asEagerSingleton();
    }
}
