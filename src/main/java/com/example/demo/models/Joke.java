package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="joke")
public class Joke {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable = false)
    Long id;
    
    @Column(nullable = false)
    String text;
}

//create table joke(id long primary key auto_increment, text varchar(200) not null)
