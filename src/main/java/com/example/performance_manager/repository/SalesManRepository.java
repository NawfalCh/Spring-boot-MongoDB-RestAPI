package com.example.performance_manager.repository;

import com.example.performance_manager.model.EvaluationRecord;
import com.example.performance_manager.model.SalesMan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesManRepository extends MongoRepository<SalesMan,Long> {

    @Update("{ '$push' : { 'records' : ?1 } }")
     long findAndPushRecordsById(int sid, EvaluationRecord record);







    @Update("{ '$pull' : { 'records' : { '_id' : ?1 } } }")
    long findAndPullRecordsById(int sid, int rid);


}
