package com.youthstudy.controller;

import com.youthstudy.entity.*;
import com.youthstudy.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    AdminRepository adminRepository;
    @Autowired
    CollegeDataRepository collegeDataRepository;
    @Autowired
    CollegeListRepository collegeListRepository;
    @Autowired
    LessonRepository lessonRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ShoppingCarRepository shoppingCarRepository;
    @Autowired
    ToDoListRepository toDoListRepository;


    @GetMapping("/user/{uid}")
    public User getUser(@PathVariable("uid") Integer uid) {
        User user = userRepository.getOne(uid);
        return user;
    }

    @GetMapping("/user")
    public User insertAdmin(User admin) {
        User save = userRepository.save(admin);
        return save;
    }

    @GetMapping("/admin/{aid}")
    public Admin getAdmin(@PathVariable("aid") Integer aid) {
        Admin admin = adminRepository.getOne(aid);
        return admin;
    }

    @GetMapping("/admin")
    public Admin insertAdmin(Admin admin) {
        Admin save = adminRepository.save(admin);
        return save;
    }

    @GetMapping("/collegedata")
    public CollegeData insertCollegeData(CollegeData collegeData) {
        CollegeData save = collegeDataRepository.save(collegeData);
        return save;
    }

    @GetMapping("/collegelist")
    public CollegeList insertCollegeList(CollegeList collegeList) {
        CollegeList save = collegeListRepository.save(collegeList);
        return save;
    }

    @GetMapping("/lesson")
    public Lesson insertLesson(Lesson lesson) {
        Lesson save = lessonRepository.save(lesson);
        return save;
    }

    @GetMapping("/order")
    public Order insertOder(Order order) {
        Order save = orderRepository.save(order);
        return save;
    }

    @GetMapping("/shoppingcar")
    public ShoppingCar insertShopping(ShoppingCar shoppingCar) {
        ShoppingCar save = shoppingCarRepository.save(shoppingCar);
        return save;
    }

    @GetMapping("/todolist")
    public ToDoList insertTodoList(ToDoList toDoList) {
        ToDoList save = toDoListRepository.save(toDoList);
        return save;
    }
}
