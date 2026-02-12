package org.java.enums.exercises.worker.entities;

import org.java.enums.exercises.worker.enums.WorkerLevel;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    //Relational
    private Departament departament;
    //One to many
    private List<HourContract> contractList = new ArrayList<>();

    public Worker(){}

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public void addContract(HourContract contract){
        this.contractList.add(contract);
    }

    public void removeContract (HourContract contract){
        this.contractList.remove(contract);
    }

    public double income(Integer year, Integer month){
        double sum = contractList.stream().
                filter(x ->
                        x.getDate().getYear() + 1900 == year &&
                        x.getDate().getMonth() + 1 == month)
                .mapToDouble(HourContract::totalValue)
                .sum();
        return sum + this.baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContractList() {
        return contractList;
    }
}
