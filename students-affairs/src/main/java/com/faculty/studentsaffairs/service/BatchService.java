package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.model.Batch;
import com.faculty.studentsaffairs.repository.BatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BatchService {

    @Autowired
    BatchRepository batchRepository;

    public List<Batch> findAllBatches () throws Exception {
        return batchRepository.findAllBatches().orElseThrow(() ->
                new Exception("لا يوجد دفعات في النظام، يرجى التواصل مع مدير النظام"));
    }
}
