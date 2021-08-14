package com.faculty.studentsaffairs.model;

import com.faculty.studentsaffairs.audit.DateAudit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "plan_subjects")
public class PlanSubject extends DateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plan_subject_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "plan_id")
    private Plan plan;

    @ManyToOne
    @JoinColumn(name = "subject_type_id")
    private SubjectType subjectType;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "study_term")
    private Term studyTerm;

    @ManyToOne
    @JoinColumn(name = "transcript_term")
    private Term transcriptTerm;

    @Column(name = "hours")
    private Integer hours;

    @Column(name = "min_test")
    private BigDecimal minTest;

    @Column(name = "max_test")
    private BigDecimal maxTest;

    @Column(name = "min_exam")
    private BigDecimal minExam;

    @Column(name = "max_exam")
    private BigDecimal maxExam;
}
