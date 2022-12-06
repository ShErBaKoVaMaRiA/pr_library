package com.example.pr_library.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books_Library {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long UID;

    private int numberrack;
    private int numbershelf;
    private int count;

    public Books_Library() {
    }

    public Books_Library(int numberrack, int numbershelf, int count) {
        this.numberrack = numberrack;
        this.numbershelf = numbershelf;
        this.count = count;
    }

    public Long getUID() {
        return UID;
    }

    public void setUID(Long UID) {
        this.UID = UID;
    }

    public int getNumberrack() {
        return numberrack;
    }

    public void setNumberrack(int numberrack) {
        this.numberrack = numberrack;
    }

    public int getNumbershelf() {
        return numbershelf;
    }

    public void setNumbershelf(int numbershelf) {
        this.numbershelf = numbershelf;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
