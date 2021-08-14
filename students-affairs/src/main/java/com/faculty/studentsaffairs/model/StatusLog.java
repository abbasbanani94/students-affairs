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
@Table(name = "status_logs")
public class StatusLog extends DateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "previous_status")
    private StudentStatus previousStatus;

    @ManyToOne
    @JoinColumn(name = "current_status")
    private StudentStatus currentStatus;

    @Column(name = "note",columnDefinition = "NVARCHAR(MAX)")
    private String note;
}
