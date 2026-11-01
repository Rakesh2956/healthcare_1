package com.smsk.healthcare.service;

import com.smsk.healthcare.entity.student;
import com.smsk.healthcare.repository.student_repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class student_service {

    private final student_repository ser;

    public List<student> get() {
        return ser.findAll();
    }
    public student inset(student new_student){
        return ser.save(new_student);
    }
    public student update(Long id,student new_student) {
        student oldid = ser.findById(id).orElseThrow(() -> new RuntimeException("id not found"));
        oldid.setName(new_student.getName());
        oldid.setAge(new_student.getAge());

        return ser.save(oldid);
    }
    public void delete(Long id){

        ser.deleteById(id);

    }

    public student insert(student studentNew) {
        return null;
    }
}

