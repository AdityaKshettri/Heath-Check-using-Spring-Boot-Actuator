package com.aditya.project.actuator.controller;

import com.aditya.project.actuator.entity.BasicEntity;
import com.aditya.project.actuator.repository.BasicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basics")
public class BasicController {

    @Autowired
    private BasicRepository basicRepository;

    @GetMapping
    public List<BasicEntity> findAll() {
        return basicRepository.findAll();
    }
}
