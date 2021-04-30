package com.aditya.project.actuator.repository;

import com.aditya.project.actuator.entity.BasicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicRepository extends JpaRepository<BasicEntity, Integer> {
}
