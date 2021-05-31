package de.karriereTutor.learngroup.luigisPizza.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student horst = new Student(1L,
                    "Horst",
                    "horst@horstmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            Student dagma = new Student(
                    "Dagma",
                    "Dagma@dagmamail.de",
                    LocalDate.of(1975, Month.MAY, 12)
            );
            Student vlad = new Student(
                    "Vlad Tepes",
                    "sweetthooth31@bloodmail.ro",
                    LocalDate.of(1431, Month.DECEMBER, 13)
            );
            Student budgie = new Student(
                    "Super Budgie",
                    "chirp@pio.sp",
                    LocalDate.of(1992, Month.MARCH, 27)
            );
            repository.saveAll(
                    List.of(horst,dagma,vlad, budgie)
            );

        };
    }

}
