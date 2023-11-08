package com.example.performance_manager.controller;

import com.example.performance_manager.model.SalesMan;
import com.example.performance_manager.service.ManagePersonal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salesman")
public class SalesmanController {

    @Autowired
    ManagePersonal managePersonal;

    @GetMapping
    public List<SalesMan> getAll(){
        return managePersonal.readAllSalesMen();

    }
    @GetMapping("{id}")
    public SalesMan getSalesman(@PathVariable int id){
        return managePersonal.readSalesMan(id);
    }

    @PostMapping
    public void addSalesman(@RequestBody SalesMan salesMan){
        managePersonal.createSalesMan(salesMan);
    }

    @PutMapping
    public SalesMan updateSalesman(@RequestBody SalesMan salesMan){
        return managePersonal.updateSalesMan(salesMan);
    }

    @DeleteMapping("{id}")
    public void deleteSalesman(@PathVariable int id){
        managePersonal.deleteSalesMan(id);
    }






}
