package edu.eci.arsw.expo.repository;

import edu.eci.arsw.expo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository <Student,Integer> {
}
