package com.example.demo.Entity.Repository;

import com.example.demo.Entity.Ground;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroundRepository extends JpaRepository<Ground, Integer> {

}