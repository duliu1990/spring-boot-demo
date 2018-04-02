package com.devnp.controller;

import com.devnp.entity.Student;
import com.devnp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by duliu on 23/7/2017.
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService ;

    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent(@RequestParam("name") String name, @RequestParam("age") Integer age, @RequestParam("birthDt")
                             @DateTimeFormat(pattern="yyyy-MM-dd") Date birthDt){
        Student student = new Student();

        student.setName(name);
        student.setAge(age);
        student.setBirthDt(birthDt);

        studentService.saveStudent(student);

        return "Add Success." ;
    }

    @RequestMapping({"/listStudent", "/listStudent/{id}"})
    @ResponseBody
    public List<Student> listStudent(@PathVariable(value = "id",required = false) Long id){
        if(id == null)
            return studentService.listStudent();
        else{
            Student student =studentService.listStudent(id);

            return  Arrays.asList(student);
        }
    }

    @RequestMapping("/delStudent/{id}")
    @ResponseBody
    public String delStudent(@PathVariable(value = "id",required = true) Long id){
        studentService.delStudent(id);

        return "Delete Success." ;
    }

    @RequestMapping("/editStudent/{id}")
    @ResponseBody
    public String editStudent(@PathVariable(value = "id",required = true) Long id, @RequestParam("name") String name,
                              @RequestParam("age") Integer age, @RequestParam("birthDt") @DateTimeFormat(pattern="yyyy-MM-dd") Date birthDt){

        Student student = studentService.listStudent(id);

        student.setName(name);
        student.setAge(age);
        student.setBirthDt(birthDt);

        studentService.saveStudent(student);

        return "Updated Success." ;
    }
}
