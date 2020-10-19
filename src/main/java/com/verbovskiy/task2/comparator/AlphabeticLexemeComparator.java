package com.verbovskiy.task2.comparator;

import com.verbovskiy.task2.composite.TextComponent;

import java.util.Comparator;

public class AlphabeticLexemeComparator implements Comparator<TextComponent> {
    @Override
    public int compare(TextComponent lexeme1, TextComponent lexeme2) {
        return lexeme1.toString().compareTo(lexeme2.toString());
    }
}
