package edu.eci.arsw.expo;

import edu.eci.arsw.expo.model.Student;
import edu.eci.arsw.expo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){

        return studentService.addStudent(student);
    }
    @GetMapping ("/consult")
    public List<Student> getStudents(){
        return studentService.findAllStudents();
    }



}
