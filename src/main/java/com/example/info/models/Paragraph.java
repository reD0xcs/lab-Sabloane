package com.example.info.models;

public class Paragraph implements Element{
    private String text;
    private int width;
    public Paragraph(String text, int width) {
        this.text = text;
        this.width = width;
    }

    public String getText() {
        return text;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void print() {
        System.out.println(text);
    }

    @Override
    public void add(Element element) {
        // Leaf com.example.lab1sabloane.Element, does nothing
    }

    @Override
    public void remove(Element element) {
        //Leaf com.example.lab1sabloane.Element, does nothing
    }

    @Override
    public Element get(int index) {
        return null; //Leaf com.example.lab1sabloane.Element, does nothing
    }
}
