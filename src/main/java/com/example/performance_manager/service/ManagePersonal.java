package com.example.performance_manager.service;

import com.example.performance_manager.model.EvaluationRecord;
import com.example.performance_manager.model.SalesMan;

import java.util.List;

public interface ManagePersonal {

    SalesMan readSalesMan(int sid );
    List<SalesMan> readAllSalesMen();
    SalesMan createSalesMan(SalesMan record );
    SalesMan updateSalesMan(SalesMan record );
    void deleteSalesMan(int sid);
    List<EvaluationRecord> readEvaluationRecords(int sid );
    long addPerformanceRecord(EvaluationRecord record , int sid );
    void deletePerformanceRecord(int rid , int sid );
}
