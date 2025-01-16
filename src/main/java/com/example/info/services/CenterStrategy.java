package com.example.info.services;

import com.example.info.models.Paragraph;

public class CenterStrategy implements Strategy {
    @Override
    public void render(Paragraph paragraph) {
        String text = paragraph.getText();
        int width = paragraph.getWidth();

        String[] words = text.split(" ");
        StringBuilder line = new StringBuilder();

        for (String word : words) {
            if (line.length() + word.length() > width) {
                int padding = (width - line.length()) / 2;
                System.out.println(" ".repeat(padding) + line.toString());
                line = new StringBuilder();
            }
            if (line.length() > 0) line.append(" ");
            line.append(word);
        }

        if (line.length() > 0) {
            int padding = (width - line.length()) / 2;
            System.out.println(" ".repeat(padding) + line.toString());
        }
    }
}
