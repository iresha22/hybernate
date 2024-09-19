package com.hybernateesercizio.hybernateesercizio.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
public class Classes {
    // fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long id;
    @Getter
    @Setter
    @Column(nullable = false)
    private String title;
    @Getter
    @Setter
    @Column(nullable = false)
    private String description;

    // empty constructor
    public Classes(){

    }

    // constructor with all the fields
    public Classes(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }


}
