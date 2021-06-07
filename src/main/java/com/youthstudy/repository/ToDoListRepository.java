package com.youthstudy.repository;


import com.youthstudy.entity.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoListRepository extends JpaRepository<ToDoList, Integer> {
}
