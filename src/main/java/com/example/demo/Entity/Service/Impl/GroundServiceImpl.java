package com.example.demo.Entity.Service.Impl;

import com.example.demo.Entity.Ground;
import com.example.demo.Entity.Pojo.GroundPojo;
import com.example.demo.Entity.Service.GroundService;
import com.example.demo.Entity.Repository.GroundRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class GroundServiceImpl implements GroundService {
            private final GroundRepository groundRepository;


            @Override
            public void saveData(GroundPojo groundPojo) {
                Ground ground = new Ground();
                ground.setId(groundPojo.getId());
                ground.setGround_name(groundPojo.getGroundName());

                groundRepository.save(ground);
            }

            @Override
            public List<Ground> getAll() {
                return groundRepository.findAll();
            }

            @Override
            public void deleteById(Integer id) {
                groundRepository.deleteById(id);
            }

            @Override
            public Optional<Ground> findById(Integer id) {
                return groundRepository.findById(id);
            }



        }






