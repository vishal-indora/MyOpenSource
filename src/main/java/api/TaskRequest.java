package api;

import model.TaskStatus;

import java.util.Date;

public class TaskRequest {
    private String id;
    private String description;
    private TaskStatus taskStatus;
    private Date scheduledTime;
}
