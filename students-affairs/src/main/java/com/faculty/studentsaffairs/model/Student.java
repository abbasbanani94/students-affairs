package com.faculty.studentsaffairs.model;

import com.faculty.studentsaffairs.audit.DateAudit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "students")
public class Student extends DateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer id;

    @Column(name = "ar_name",columnDefinition = "NVARCHAR(MAX)")
    private String arName;

    @Column(name = "en_name")
    private String enName;

    @Column(name = "reg_no",unique = true)
    private String regNo;

    @Column(name = "reg_symbol")
    private String regSymbol;

    @ManyToOne
    @JoinColumn(name = "gender_id")
    private Gender gender;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "pob")
    private String pob;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "blood")
    private String blood;

    @ManyToOne
    @JoinColumn(name = "identity_id")
    private IdentityType identityType;

    @Column(name = "identity_no")
    private String identityNo;

    @Column(name = "certificate")
    private String certificate;

    @Column(name = "high_school")
    private String highSchool;

    @Column(name = "max_marks")
    private Integer maxMarks;

    @Column(name = "total_marks")
    private BigDecimal totalMarks;

    @Column(name = "avg_marks")
    private BigDecimal avgMarks;

    @Column(name = "current_city")
    private String currentCity;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private StudentStatus status;

    @Column(name = "note")
    private String note;

    @ManyToOne
    @JoinColumn(name = "join_year")
    private Year joinYear;

    @Column(name = "current_registration",unique = true)
    private Integer currentRegistration;

    @Column(name = "image_url")
    private String imageUrl;
}
