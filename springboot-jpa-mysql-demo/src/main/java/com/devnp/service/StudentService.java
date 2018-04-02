package com.devnp.service;

import com.devnp.entity.Student;
import com.devnp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by duliu on 23/7/2017.
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository ;

    @Transactional
    public void saveStudent(Student student){
        studentRepository.save(student);
    }

    public List<Student> listStudent(){
        return studentRepository.findAll();
    }

    public Student listStudent(Long id){
        return studentRepository.findOne(id);
    }

    @Transactional
    public void delStudent(Long id){
        studentRepository.delete(id);
    }

}
