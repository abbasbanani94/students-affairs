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
@Table(name = "batches")
public class Batch extends DateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "batch_id")
    private Integer id;

    @Column(name = "en_name",unique = true)
    private String enName;

    @Column(name = "ar_name",unique = true,columnDefinition = "NVARCHAR(MAX)")
    private String arName;

    @Column(name = "no",unique = true)
    private String no;
}
