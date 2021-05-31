package de.karriereTutor.learngroup.luigisPizza.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
//        return List.of(
//                new Student(
//                        1L,
//                        "Horst",
//                        "horst@horstmail.de",
//                        20,
//                        LocalDate.of(2001, Month.FEBRUARY, 14))
//        );

    }

    public void addNewStudent(Student student) {
//        Optional<Student> studentOptional = studentRepository.findStudentByEmail((student.getEmail()));
//
//        if (studentOptional.isPresent()){
//            throw  new IllegalStateException("email taken");
//        }
        System.out.println(student);
//        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if (!exists) {
            throw new IllegalStateException("student with id" + studentId + "does not exists");
        }
        studentRepository.deleteById(studentId);
    }

//    @Transactional
//    public void updateStudent(Long studentId, String name, String email) {
//        Student student = studentRepository.findStudentById(studentId).orElseThrow(() -> new IllegalStateException("student with id " + studentId + "does not exists"))
//
//        if (name != null &&
//                name.length() > 0 &&
//        !Objects.equals(student.getName(), name)){
//            student.setName(name);
//        } if (email != null &&
//                name.length() > 0 &&
//                !Objects.equals(student.getEmail(), email)){
//            Optional<Student> studentOptional = studentRepository.findStudentByEmail(email);
//            if (studentOptional.isPresent()){
//                throw new IllegalStateException("email taken");
//            }
//            student.setEmail(email);
//        }
//    }
}
