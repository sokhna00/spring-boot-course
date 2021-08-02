package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam=new Student(
                    "Mariam",
                    LocalDate.of(2000, Month.JANUARY,5),
                    "mariam@gmail.com",
                    21
            );
            Student alex=new Student(
                    "Alex",
                    LocalDate.of(2000, Month.JANUARY,5),
                    "alex@gmail.com",
                    21
            );
            repository.saveAll(
                    List.of(mariam,alex)
            );


        };
    }
}
