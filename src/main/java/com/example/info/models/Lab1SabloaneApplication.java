package com.example.info.models;

import com.example.info.services.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.info.services.*;

@SpringBootApplication
public class Lab1SabloaneApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab1SabloaneApplication.class, args);

        // Create a book
        Book myBook = new Book("Design Patterns");

        // Add authors
        Author author1 = new Author("Andrei", "Catalin");
        Author author2 = new Author("Cosmin", "Prislop");
        myBook.addAuthor(author1);
        myBook.addAuthor(author2);

        // Create a section
        Section section1 = new Section("Introducere");
        section1.add(new Paragraph("Mare paragraf aliniat la stanga .", 15));
        section1.add(new Image("inceput.png"));
        section1.add(new Table("Tabel cu continut"));
        Strategy ls = new LeftStrategy();
        Strategy rs = new RightStrategy();
        Strategy ct = new CenterStrategy();
        Strategy js = new JustifyStrategy();
        Paragraph p =(new Paragraph("ana are mere multe, ian are concerte multe,cine e mai tare", 16));
        ls.render(p);
        rs.render(p);
        ct.render(p);
        js.render(p);

        // Add section to book
        myBook.add(section1);

        // Print the book structure
        //myBook.print();
    }
}
