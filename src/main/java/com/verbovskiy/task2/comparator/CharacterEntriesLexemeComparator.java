package com.verbovskiy.task2.comparator;

import com.verbovskiy.task2.composite.TextComponent;

import java.util.Comparator;
import java.util.List;

public class CharacterEntriesLexemeComparator implements Comparator<TextComponent> {
    private final char character;

    public CharacterEntriesLexemeComparator(char character) {
        this.character = character;
    }

    @Override
    public int compare(TextComponent lexeme1, TextComponent lexeme2) {
        return Integer.compare(calculateSymbolEntries(lexeme1), calculateSymbolEntries(lexeme2));
    }

    private int calculateSymbolEntries(TextComponent component) {
        int numberOfEntries = 0;
        List<TextComponent> characters = component.getChildren();
        
        for (TextComponent character : characters) {
            if(character.toString().equals(String.valueOf(character))) {
                numberOfEntries++;
            }
        }
        return numberOfEntries;
    }
}
