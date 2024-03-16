package edu.eci.arsw.expo.service;

import edu.eci.arsw.expo.model.Student;
import edu.eci.arsw.expo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Student addStudent(Student student){
        student.setCarnet(UUID.randomUUID().toString().split("-")[0]);
        return studentRepository.save(student);
    }
    public List<Student> findAllStudents(){

        return studentRepository.findAll();
    }
    public Optional<Student> getStudent(int id){
        return studentRepository.findById(id);
    }
    public void deleteStudent(int id){
        studentRepository.deleteById(id);
    }
    public void updateStudent (Student student){
        studentRepository.save(student);
    }
}
