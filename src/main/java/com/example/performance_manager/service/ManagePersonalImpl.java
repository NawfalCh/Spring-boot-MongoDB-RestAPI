package com.example.performance_manager.service;

import com.example.performance_manager.model.EvaluationRecord;
import com.example.performance_manager.model.SalesMan;
import com.example.performance_manager.repository.SalesManRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagePersonalImpl implements ManagePersonal{

    @Autowired
    private SalesManRepository salesmanrepo;
    @Override
    public SalesMan readSalesMan(int sid) {
        return salesmanrepo.findById((long) sid).orElse(null);
    }

    @Override
    public List<SalesMan> readAllSalesMen() {
        return salesmanrepo.findAll();
    }

    @Override
    public SalesMan createSalesMan(SalesMan record) {
        return salesmanrepo.save(record);
    }

    @Override
    public SalesMan updateSalesMan(SalesMan record) {
        if (record==null || record.getId()==null)
            return null;
        return salesmanrepo.save(record);

    }

    @Override
    public void deleteSalesMan(int sid) {
        salesmanrepo.deleteById((long) sid);

    }

    @Override
    public List<EvaluationRecord> readEvaluationRecords(int sid) {
        SalesMan salesman = salesmanrepo.findById((long) sid).orElse(null);
        if(salesman == null )
            return null;
        return salesman.getRecords();
    }

    @Override
    public long addPerformanceRecord(EvaluationRecord record, int sid) {
        return salesmanrepo.findAndPushRecordsById(sid, record);
    }

    @Override
    public void deletePerformanceRecord(int rid, int sid) {
        salesmanrepo.findAndPullRecordsById(sid, rid);
    }
}
