package com.faculty.studentsaffairs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "grades")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grade_id")
    private Integer id;

    @Column(name = "ar_name",columnDefinition = "NVARCHAR(MAX)")
    private String arName;

    @Column(name = "en_name")
    private String enName;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "min_end")
    private BigDecimal minEnd;

    @Column(name = "max_end")
    private BigDecimal maxEnd;

    @ManyToOne
    @JoinColumn(name = "mark_status_id")
    private MarkStatus status;
}
