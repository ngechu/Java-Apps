package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentConfiguration {
    @Bean
    CommandLineRunner commandLineRunner( StudentRepository repository){
        return args -> {
           Student ngechu = new Student("ngechumunga",
                    "ngechu@mail.com",
                    LocalDate.of(2000,
                            Month.JULY,13),25);
            repository.saveAll(List.of(ngechu));
        };

    }
}
