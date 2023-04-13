package com.javarush.services;

import com.javarush.dao.TaskDAO;
import com.javarush.domain.Status;
import com.javarush.domain.Task;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.Objects.isNull;

@Service
public class TaskService {
    private final TaskDAO taskDAO;

    public TaskService(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }

    public List<Task> getAll(int offset, int limit){
        return taskDAO.getAll(offset, limit);
    }

    public int getAllCount(){
        return taskDAO.getAllCount();
    }

    @SuppressWarnings("UnusedReturnValue")
    @Transactional
    public Task edit(Long id, String description, Status status){
        Task task = taskDAO.getById(id);
        if (isNull(task)){
            throw new RuntimeException("Task not found");
        }
        task.setDescription(description);
        task.setStatus(status);
        taskDAO.saveOrUpdate(task);
        return task;
    }

    @SuppressWarnings("UnusedReturnValue")
    public Task create(String description, Status status){
        Task task = new Task();
        task.setDescription(description);
        task.setStatus(status);
        taskDAO.saveOrUpdate(task);
        return task;
    }

    @Transactional
    public void delete(Long id){
        Task task = taskDAO.getById(id);
        if (isNull(task)){
            throw new RuntimeException("Task not found");
        }
        taskDAO.delete(task);
    }
}
