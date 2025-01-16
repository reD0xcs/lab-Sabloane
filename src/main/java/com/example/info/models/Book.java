package com.example.info.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Book implements Element {
    @Id
    private String title;
    @ManyToMany
    private List<Author> authors = new ArrayList<>();
    @OneToMany(targetEntity = BaseElement.class)
    private List<Element> elements = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public Book() {

    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    @Override
    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Authors: ");
        for (Author author : authors) {
            author.print();
        }
        System.out.println("Elements: ");
        for (Element element : elements) {
            element.print();
        }
    }

    @Override
    public void add(Element element) {
        if (element instanceof Section) {
            elements.add(element);
        }
    }

    @Override
    public void remove(Element element) {
        elements.remove(element);
    }

    @Override
    public Element get(int index) {
        return elements.get(index);
    }
}
