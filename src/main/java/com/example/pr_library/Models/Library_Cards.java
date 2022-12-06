package com.example.pr_library.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Library_Cards {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long UID;

    private Date date_open;
    private Date date_close;

    public Library_Cards() {
    }

    public Library_Cards(Date date_open, Date date_close) {
        this.date_open = date_open;
        this.date_close = date_close;
    }

    public Long getUID() {
        return UID;
    }

    public void setUID(Long UID) {
        this.UID = UID;
    }

    public Date getDate_open() {
        return date_open;
    }

    public void setDate_open(Date date_open) {
        this.date_open = date_open;
    }

    public Date getDate_close() {
        return date_close;
    }

    public void setDate_close(Date date_close) {
        this.date_close = date_close;
    }
}
