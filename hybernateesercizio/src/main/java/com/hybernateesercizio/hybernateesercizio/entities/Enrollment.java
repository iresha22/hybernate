package com.hybernateesercizio.hybernateesercizio.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

public class Enrollment {
    // fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long id;
    @Getter
    @Setter
    @ManyToOne
    private Students students;
    @Getter
    @Setter
    @ManyToOne
    private Classes classes;

    // empty constructor
    public Enrollment(){

    }

    // constructor with all the fields
    public Enrollment(Long id, Students students, Classes classes) {
        this.id = id;
        this.students = students;
        this.classes = classes;
    }


}
