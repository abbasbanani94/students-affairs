package com.faculty.studentsaffairs.model;

import com.faculty.studentsaffairs.audit.DateAudit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "subjects")
public class Subject extends DateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Integer id;

    @Column(name = "en_name")
    private String enName;

    @Column(name = "ar_name",columnDefinition = "NVARCHAR(MAX)")
    private String arName;
}
