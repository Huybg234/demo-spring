package com.github.huybg.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "student")
public class Student implements Serializable {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "STUDENT_SEQ")
    @SequenceGenerator(name = "STUDENT_SEQ", sequenceName = "STUDENT_SEQ", allocationSize = 1, initialValue = 1)
    int id;

    @Column(name = "full_name", nullable = false)
    String fullName;

    @Column(name = "birthday", nullable = false)
    @Temporal(TemporalType.DATE)
    Date birthday;

    @Column(name = "hometown", nullable = false)
    String hometown;

    @Column(name = "class_name", nullable = false)
    String className;

    @Column(name = "gender", nullable = false)
    String gender;

}
