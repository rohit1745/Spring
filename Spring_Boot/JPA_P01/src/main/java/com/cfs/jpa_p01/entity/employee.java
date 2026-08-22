package com.cfs.jpa_p01.entity;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;


//create database jpa_p01;
//use jpa_p01;
//create table employee(
//        id int primary key auto_increment,
//        name varchar(30) not null,
//        emial varchar(20) not null,
//        department varchar(20) not null,
//        salary double not null
//        );



@Entity
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(nullable = false,length = 30)
    private String name;

    @Column(nullable = false,length = 30)
    private String email;

    @Column(nullable = false,length = 20)
    private String department;

    @Column(nullable = false,length = 30)
    private Double salary;


    public employee()
    {

    }

    public employee(Integer ID, String name, String email, String department, Double salary) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }
}

