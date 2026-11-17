package com.example.taskapi.service;

import com.example.taskapi.model.Task;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 内存版任务存储，仅用于演示，重启后数据丢失。
 */
@Service
public class TaskService {

    private final Map<Long, Task> store = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(0);

    public TaskService() {
        create("熟悉 Spring Boot 项目结构");
        create("跑通三个 REST 接口");
    }

    public List<Task> findAll() {
        return new ArrayList<>(store.values());
    }

    public Optional<Task> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    public Task create(String title) {
        long id = idGenerator.incrementAndGet();
        Task task = new Task(id, title, false, LocalDateTime.now());
        store.put(id, task);
        return task;
    }
}
