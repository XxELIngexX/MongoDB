package edu.eci.arsw.expo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document (collection = "Students")

public class Student {
    @Id
    private String id;

    public String getid() {
        return id;
    }

    public void setCarnet(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Field
    private int age;
    @Field
    private String name;
    @Field
    private String lastname;

    public Student(String id, int age, String name, String lastname) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.lastname = lastname;
    }
}
