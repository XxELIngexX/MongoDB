package edu.eci.arsw.expo;

import edu.eci.arsw.expo.model.Student;
import edu.eci.arsw.expo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    @Autowired
    StudentService studentService;
    public static void main(String[] args){
        SpringApplication.run(Main.class,args);
    }

    @Bean
    public CommandLineRunner run() throws Exception {
        return (args) -> {
        studentService.addStudent(new Student("1",22, "cesar", "amaya"));
            studentService.addStudent(new Student("2",20, "sara", "gomez"));
            studentService.addStudent(new Student("3",18, "andres", "arias"));
            studentService.addStudent(new Student("4",23, "lucia", "pachon"));
            studentService.addStudent(new Student("5",21, "sebastian", "torres"));
            studentService.addStudent(new Student("6",22, "ana", "perez"));

        };
}}