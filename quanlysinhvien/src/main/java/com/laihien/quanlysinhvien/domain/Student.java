package com.laihien.quanlysinhvien.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private long id;
    private String studentCode;
    private String studentName;
    private String dateOfBirth;
    private String address;
    private String 

}
