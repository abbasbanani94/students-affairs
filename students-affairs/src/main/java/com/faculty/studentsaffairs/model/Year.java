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
@Table(name = "years")
public class Year extends DateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "year_id")
    private Integer id;

    @Column(name = "start_year",unique = true)
    private String startYear;

    @Column(name = "end_year",unique = true)
    private String endYear;

    @Column(name = "symbol",unique = true)
    private String symbol;

    @Column(name = "current_year")
    private Boolean currentYear;
}
