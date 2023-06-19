package com.tuto.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name="employees" )
public class Employee {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @Column( name = "first_name" , nullable = false )
    private String firstName;
    @Column( name = "last_name" )
    private String lastName;
    @Column( name = "email" )
    private String email;
}
