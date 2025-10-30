package ToDo.dao;

import ToDo.model.Task;

import java.util.HashMap;
import java.util.Map;

public class TaskDao {

    private Map<String, Task> taskMap; // it will have task id to task mapping
    private Map<String, HashMap<String, Task>> userMap; // it will have user id to  map of task ids and tasks

    TaskDao() {
        taskMap = new HashMap<>();
        userMap = new HashMap<>();
    }

    public Task getTaskById(String taskId){
        return taskMap.getOrDefault(taskId, null);
    }

    public Map<String, Task> getTasksForUser(String userId) {
        return userMap.getOrDefault(userId, new HashMap<>());
    }

    public void createTask(String userId, Task task) {
        userMap.computeIfAbsent(userId, k -> new HashMap<>());
        Map<String, Task> tasks = userMap.get(userId);
        tasks.put(task.getId(), task);
        taskMap.put(task.getId(), task);
    }

    public void updateTask(String userId, Task task) {
        Map<String, Task> tasks = userMap.get(userId);
        tasks.put(task.getId(), task);
        taskMap.put(task.getId(), task);
    }

    public void deleteTask(String userId, String taskId) {
        Map<String, Task> tasks = userMap.get(userId);
        tasks.remove(taskId);
        taskMap.remove(taskId);
    }
}
