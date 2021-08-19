package com.faculty.studentsaffairs.controller;

import com.faculty.studentsaffairs.dto.RegistrationDgvDto;
import com.faculty.studentsaffairs.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    @GetMapping("/dgv/{deptId}/{batchId}")
    public ResponseEntity findAllRegistrationsByDeptAndBatch(@PathVariable (value = "deptId") Integer deptId,
                                                             @PathVariable (value = "batchId") Integer batchId) {
        return new ResponseEntity(registrationService.findAllRegistrationsByDeptAndBatch(deptId,batchId).stream()
                .map(r -> {
                    return new RegistrationDgvDto(r.getStudent().getId(),
                            r.getStudent().getArName(),r.getStudent().getEnName(),
                            r.getStudent().getRegSymbol() + r.getStudent().getRegNo(),
                            r.getDept().getArName(),r.getBatch().getArName(),
                            r.getCategory().getArName(),r.getTerm().getArName(),
                            r.getYear().getStartYear() + "-" + r.getYear().getEndYear(),
                            r.getStudent().getJoinYear().getStartYear() + "-" + r.getStudent().getJoinYear().getEndYear(),
                            r.getStudent().getGender().getArName(),r.getStudent().getDob(),
                            r.getStudent().getPob(),r.getStudent().getNationality(),r.getStudent().getMobile(),
                            r.getStudent().getBlood(),r.getStudent().getIdentityType().getName(),
                            r.getStudent().getIdentityNo(),r.getStudent().getCertificate(),r.getStudent().getSchool(),
                            r.getStudent().getSchoolYear(),r.getStudent().getMaxMarks(),r.getStudent().getTotalMarks(),
                            r.getStudent().getAvgMarks(),r.getStudent().getCurrentCity(),
                            r.getStudent().getStatus().getName(),r.getStudent().getNote(),
                            r.getId());
                }).collect(Collectors.toList()), HttpStatus.OK);
    }
}
