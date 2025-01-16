package com.example.info.services;

import com.example.info.models.Paragraph;

public class JustifyStrategy implements Strategy {
    @Override
    public void render(Paragraph paragraph) {
        String text = paragraph.getText();
        int width = paragraph.getWidth();

        // Split the text into words
        String[] words = text.split(" ");
        StringBuilder line = new StringBuilder();

        for (String word : words) {
            // Check if adding the next word would exceed the width
            if (line.length() + word.length() > width) {
                justifyLine(line.toString(), width);
                line = new StringBuilder();
            }
            // Add the word to the line with a space
            if (line.length() > 0) line.append(" ");
            line.append(word);
        }

        // Print any remaining text in the line without justification
        if (line.length() > 0) {
            System.out.println(line.toString());
        }
    }

    private void justifyLine(String line, int width) {
        String[] words = line.split(" ");
        int totalSpaces = width - line.replace(" ", "").length();

        if (words.length == 1) {
            // If there's only one word, we simply print it left-aligned
            System.out.println(line);
            return;
        }

        // Calculate space to add between each word
        int spacesBetweenWords = totalSpaces / (words.length - 1);
        int extraSpaces = totalSpaces % (words.length - 1);

        StringBuilder justifiedLine = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            justifiedLine.append(words[i]);
            if (i < words.length - 1) {
                // Add the calculated spaces between words
                justifiedLine.append(" ".repeat(spacesBetweenWords));
                // Add an extra space if there are remaining spaces
                if (extraSpaces > 0) {
                    justifiedLine.append(" ");
                    extraSpaces--;
                }
            }
        }

        System.out.println(justifiedLine.toString());
    }
}
