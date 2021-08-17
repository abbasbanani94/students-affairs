package com.faculty.studentsaffairs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "identity_types")
public class IdentityType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identity_id")
    private Integer id;

    @Column(name = "name",columnDefinition = "NVARCHAR(MAX)")
    private String name;
}
