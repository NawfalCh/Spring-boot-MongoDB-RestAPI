package com.example.performance_manager.controller;

import com.example.performance_manager.model.EvaluationRecord;
import com.example.performance_manager.service.ManagePersonal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evalrecord")
public class EvalRecordController {
    @Autowired
    ManagePersonal managePersonal;

    @GetMapping("{id}")
    public List<EvaluationRecord> getSalesmanRecords(@PathVariable int id){
        return managePersonal.readEvaluationRecords(id);
    }

    @PostMapping("{id}")
    public long createRecord(EvaluationRecord record, int id){
        return managePersonal.addPerformanceRecord(record, id);
    }

    @DeleteMapping("{rid}/{sid}")
    public void deleteRecord(@PathVariable int rid,@PathVariable int sid){
        managePersonal.deletePerformanceRecord(rid, sid);
    }



}
