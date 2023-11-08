package com.example.performance_manager.model;


import org.springframework.data.annotation.Id;

public class EvaluationRecord {

    @Id
    private Integer goalId;
    private String goalDescription;
    private Integer targetValue;
    private Integer actualValue;
    private Integer year;

    public EvaluationRecord(Integer goalId, String goalDescription, Integer targetValue, Integer actualValue, Integer year) {
        this.goalId = goalId;
        this.goalDescription = goalDescription;
        this.targetValue = targetValue;
        this.actualValue = actualValue;
        this.year = year;
    }

    public Integer getGoalId() {
        return goalId;
    }

    public void setGoalId(Integer goalId) {
        this.goalId = goalId;
    }

    public String getGoalDescription() {
        return goalDescription;
    }

    public void setGoalDescription(String goalDescription) {
        this.goalDescription = goalDescription;
    }

    public Integer getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(Integer targetValue) {
        this.targetValue = targetValue;
    }

    public Integer getActualValue() {
        return actualValue;
    }

    public void setActualValue(Integer actualValue) {
        this.actualValue = actualValue;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
