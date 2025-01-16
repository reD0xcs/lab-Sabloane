package com.example.info.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Table implements Element {
    @Id
    private String data;

    public Table(String data) {
        this.data = data;
    }

    public Table() {

    }

    @Override
    public void print() {
        System.out.println("com.example.lab1sabloane.Table: " + data);
    }

    @Override
    public void add(Element element) {
        //Leaf, does nothing
    }

    @Override
    public void remove(Element element) {
        //Leaf, does nothing
    }

    @Override
    public Element get(int index) {
        return null;
    }
}
