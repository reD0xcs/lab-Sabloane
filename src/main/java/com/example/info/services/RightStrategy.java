package com.example.info.services;

import com.example.info.models.Paragraph;

public class RightStrategy implements Strategy {
    @Override
    public void render(Paragraph paragraph) {
        String text = paragraph.getText();
        int width = paragraph.getWidth();

        String[] words = text.split(" ");
        StringBuilder line = new StringBuilder();

        for (String word : words) {
            if (line.length() + word.length() > width) {
                int padding = Math.max(width - line.length(), 0); // Ensure padding is not negative
                System.out.println(" ".repeat(padding) + line.toString());
                line = new StringBuilder();
            }
            if (line.length() > 0) line.append(" ");
            line.append(word);
        }

        // Print any remaining text in the line with right alignment
        if (line.length() > 0) {
            int padding = Math.max(width - line.length(), 0); // Ensure padding is not negative
            System.out.println(" ".repeat(padding) + line.toString());
        }
    }
}
