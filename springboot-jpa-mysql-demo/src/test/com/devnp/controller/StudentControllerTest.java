package com.devnp.controller;

import com.devnp.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by duliu on 23/7/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentControllerTest {

    @Autowired
    private StudentController studentController ;

    @Test
    public void addStudentTest(){

        String str = studentController.addStudent("Lao Zhao", 29, new Date());
        System.out.println(str);

        List<Student> students = studentController.listStudent(null);

        if (students != null && !students.isEmpty()){
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));
            }
        }
    }

    @Test
    public void listStudentTest(){
        List<Student> students = studentController.listStudent(null);

        if (students != null && !students.isEmpty()){
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));
            }
        }

        List<Student> students2 = studentController.listStudent(1L);

        if (students2 != null && !students2.isEmpty()){
            for (int i = 0; i < students2.size(); i++) {
                System.out.println(students2.get(i));
            }
        }
    }

    @Test
    public void editStudent(){
        List<Student> students = studentController.listStudent(1L);

        if (students != null && !students.isEmpty()){
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));
            }
        }
        String str = studentController.editStudent(1L, "Cheng Long", 50, new Date());
        System.out.println(str);

        List<Student> students2 = studentController.listStudent(1L);

        if (students2 != null && !students2.isEmpty()){
            for (int i = 0; i < students2.size(); i++) {
                System.out.println(students2.get(i));
            }
        }
    }

    @Test
    public void delStudent(){
        String str = studentController.delStudent(1L);
        System.out.println(str);
    }
}