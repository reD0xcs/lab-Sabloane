package com.example.info.models;

public class Image implements Element {
    private String url;

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void print() {
        System.out.println("com.example.lab1sabloane.Image: " + url);
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
