package api;

import com.google.inject.Inject;
import dao.TaskDao;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * I will expose my task endpoints here
 */
@Path("/api/v1")
public class TaskResource {
    private static Logger logger  = LoggerFactory.getLogger(TaskResource.class);

    private TaskDao taskDao;

    @Inject
    public TaskResource(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    @GET
    @Path("/tasks/{userId}")
    public Response getTasks(@PathParam("userId") String userId) {
        logger.debug("Called getTasks for user {}", userId);
        Map<String, Task> tasksForUser = taskDao.getTasksForUser(userId);
        return Response.ok(tasksForUser).build();
    }

    @POST
    @Path("/tasks/{userId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTask(@PathParam("userId") String userId, Task task) {
        logger.debug("Creating task {} for user {}", task, userId);
        taskDao.createTask(userId, task);
        if(task.getScheduledTime() == null) task.setScheduledTime(LocalDateTime.now().plusMinutes(30));
        return Response.ok().build();
    }


}
