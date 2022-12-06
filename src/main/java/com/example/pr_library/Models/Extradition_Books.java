package com.example.pr_library.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Extradition_Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long UID;

    private Date dateextradition;
    private Date datereturn;

    public Extradition_Books() {
    }

    public Extradition_Books(Date dateextradition, Date datereturn) {
        this.dateextradition = dateextradition;
        this.datereturn = datereturn;
    }

    public Long getUID() {
        return UID;
    }

    public void setUID(Long UID) {
        this.UID = UID;
    }

    public Date getDateextradition() {
        return dateextradition;
    }

    public void setDateextradition(Date dateextradition) {
        this.dateextradition = dateextradition;
    }

    public Date getDatereturn() {
        return datereturn;
    }

    public void setDatereturn(Date datereturn) {
        this.datereturn = datereturn;
    }
}
