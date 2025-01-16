package com.example.info.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;

import java.util.ArrayList;
import java.util.List;


public class Section implements Element {

    private String title;

    private List<Element> children = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public Section() {
    }

    @Override
    public void print() {
        System.out.println("com.example.lab1sabloane.Section: " + title);
        for (Element child : children) {
            child.print();
        }
    }

    @Override
    public void add(Element element) {
        children.add(element);
    }

    @Override
    public void remove(Element element) {
        children.remove(element);
    }

    @Override
    public Element get(int index) {
        return children.get(index);
    }
}
