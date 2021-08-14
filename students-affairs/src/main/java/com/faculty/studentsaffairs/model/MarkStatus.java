package com.faculty.studentsaffairs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "mark_status")
public class MarkStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mark_status_id")
    private Integer id;

    @Column(name = "en_name")
    private String enName;

    @Column(name = "ar_name",columnDefinition = "NVARCHAR(MAX)")
    private String arName;
}
