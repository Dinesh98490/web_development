package com.example.demo.Entity.Controller;

import com.example.demo.Entity.Ground;
import com.example.demo.Entity.Pojo.GroundPojo;
import com.example.demo.Entity.Service.GroundService;
import com.example.demo.Entity.Repository.GroundRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ground")
@RequiredArgsConstructor
public class GroundController {

    private final GroundService groundService;


    @GetMapping("/get")
    public List<Ground> getData() {
        return this.groundService.getAll();
    }


    @PostMapping("/save")
    public void save(@RequestBody GroundPojo groundPojo) {
        this.groundService.saveData(groundPojo);

    }

    @GetMapping("/get/{id}")
    public Optional<Ground> getData(@PathVariable Integer id) {
        return groundService.findById(id);
    }
    @DeleteMapping("/delete{id}")
    public void delete(@PathVariable Integer id) {
        this.groundService.deleteById(id);
    }

}
