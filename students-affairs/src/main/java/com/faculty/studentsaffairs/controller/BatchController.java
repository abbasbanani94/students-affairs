package com.faculty.studentsaffairs.controller;

import com.faculty.studentsaffairs.dto.ComboDto;
import com.faculty.studentsaffairs.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/batches")
public class BatchController {

    @Autowired
    BatchService batchService;

    @GetMapping("/combo")
    public ResponseEntity findAllBatchesCombo () throws Exception {
        return new ResponseEntity(batchService.findAllBatches().stream().map(batch -> {
            return new ComboDto(batch.getId(),batch.getArName());
        }).collect(Collectors.toList()), HttpStatus.OK);
    }
}
