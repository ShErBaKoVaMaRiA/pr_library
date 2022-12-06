package com.example.pr_library.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Readers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long UID;

    private String surname;
    private String name;
    private String middlename;
    private Date datebirthday;
    private String passport;
    private String telefon;


    public Readers() {
    }

    public Readers(String surname, String name, String middlename, Date datebirthday, String passport, String telefon) {
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.datebirthday = datebirthday;
        this.passport = passport;
        this.telefon = telefon;
    }

    public Long getUID() {
        return UID;
    }

    public void setUID(Long UID) {
        this.UID = UID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public Date getDatebirthday() {
        return datebirthday;
    }

    public void setDatebirthday(Date datebirthday) {
        this.datebirthday = datebirthday;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}