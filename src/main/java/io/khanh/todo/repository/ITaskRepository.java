package io.khanh.todo.repository;

import io.khanh.todo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITaskRepository extends JpaRepository<Task, Integer> {



}
