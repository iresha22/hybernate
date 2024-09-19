package com.hybernateesercizio.hybernateesercizio.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
public class Students {
    // fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long id;
    @Setter
    @Getter
    @Column(nullable = false)
    private String firstname;
    @Getter
    @Setter
    @Column(nullable = false)
    private String lastname;
    @Getter
    @Setter
    @Column(unique = true, nullable = false)
    private String email;

    // empty constructor
    public Students(){

    }

    // constructor with all the fields
    public Students(Long id, String firstname, String lastname, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }


}
