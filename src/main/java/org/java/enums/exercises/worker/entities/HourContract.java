package org.java.enums.exercises.worker.entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valurPerHour;
    private Integer hours;

    public HourContract(){}
    public HourContract(Date date, Double valurPerHour, Integer hours){
        this.date = date;
        this.valurPerHour = valurPerHour;
        this.hours  = hours;
    }

    public Double totalValue(){
        return this.valurPerHour * this.hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValurPerHour() {
        return valurPerHour;
    }

    public void setValurPerHour(Double valurPerHour) {
        this.valurPerHour = valurPerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
