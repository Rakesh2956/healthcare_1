package com.smsk.healthcare.controller;

import com.smsk.healthcare.entity.student;
import com.smsk.healthcare.service.student_service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Home")
@RequiredArgsConstructor
public class student_controller {
    private final student_service con;

    @GetMapping("/all")
    public List<student> getall() {
        return con.get();
    }

    @PostMapping("/add")
    public student add(@RequestBody student student_new) {
        return con.inset(student_new);
    }

    @PutMapping("/update/{id}")
    public student update(@PathVariable Long id, @RequestBody student student_new) {
        return con.update(id, student_new);
    }

    @DeleteMapping("/delete/{id}")

    public void delete(@PathVariable Long id) {
        con.delete(id);
    }
}