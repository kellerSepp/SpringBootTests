package de.karriereTutor.learngroup.luigisPizza.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //SELECT * FROM student Where email = ?
    //@Query("SELECT s FROM Student s Where s.email = ?1")
    //Optional<Student> findStudentByEmail(String email);


    Optional<Object> findStudentById(Long studentId);
}
