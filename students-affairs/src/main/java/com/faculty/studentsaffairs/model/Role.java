package com.faculty.studentsaffairs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer id;

    @Column(name = "en_name", unique = true)
    private String enName;

    @Column(name = "ar_name",columnDefinition = "NVARCHAR(MAX)")
    private String arName;
}
