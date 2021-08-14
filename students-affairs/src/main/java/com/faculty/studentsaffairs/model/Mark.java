package com.faculty.studentsaffairs.model;

import com.faculty.studentsaffairs.audit.DateAudit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "marks")
public class Mark extends DateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mark_id")
    private BigInteger id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "plan_subject_id")
    private PlanSubject planSubject;

    @Column(name = "test")
    private BigDecimal test;

    @Column(name = "exam")
    private BigDecimal exam;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "avg")
    private BigDecimal avg;

    @ManyToOne
    @JoinColumn(name = "grade_id")
    private Grade grade;

    @ManyToOne
    @JoinColumn(name = "mark_type_id")
    private MarkType markType;

    @Column(name = "on_100")
    private Boolean on100;

    @ManyToOne
    @JoinColumn(name = "taking_year")
    private Year takingYear;

    @ManyToOne
    @JoinColumn(name = "passing_year")
    private Year passingYear;

    @Column(name = "moved")
    private Boolean moved;

    @Column(name = "note",columnDefinition = "NVARCHAR(MAX)")
    private String note;

    @Column(name = "editable")
    private Boolean editable;
}
