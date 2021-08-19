package com.faculty.studentsaffairs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RegistrationDgvDto {

    private Integer studentId;
    private String arName;
    private String enName;
    private String regNo;
    private String dept;
    private String batch;
    private String category;
    private String term;
    private String year;
    private String joining;
    private String gender;
    private LocalDate dob;
    private String pob;
    private String nationality;
    private String mobile;
    private String blood;
    private String identityType;
    private String identityNo;
    private String certificate;
    private String school;
    private String schoolYear;
    private Integer maxMarks;
    private BigDecimal totalMarks;
    private BigDecimal avgMarks;
    private String city;
    private String status;
    private String note;
    private Integer registrationId;
}
