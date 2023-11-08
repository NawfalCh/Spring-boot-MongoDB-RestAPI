package com.example.performance_manager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "salesman")
public class SalesMan {

    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private List<EvaluationRecord> records;

    public SalesMan(Integer id, String firstName, String lastName, String jobTitle, List<EvaluationRecord> records) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.records = records;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<EvaluationRecord> getRecords() {
        return records;
    }

    public void setRecords(List<EvaluationRecord> records) {
        this.records = records;
    }
}
