package com.verbovskiy.task2.comparator;

import com.verbovskiy.task2.composite.TextComponent;
import com.verbovskiy.task2.composite.impl.CharacterComponent;
import com.verbovskiy.task2.composite.CharacterType;

import java.util.Comparator;
import java.util.List;

public class SentenceWordLengthComparator implements Comparator<TextComponent> {
    @Override
    public int compare(TextComponent sentence1, TextComponent sentence2) {
            return Integer.compare(totalWordLength(sentence1), totalWordLength(sentence2));
    }

    private int totalWordLength(TextComponent sentence) {
        int sum = 0;
        TextComponent space = new CharacterComponent(" ", CharacterType.SYMBOL);

        for (TextComponent lexeme : sentence.getChildren()) {
            if (!lexeme.equals(space)) {
                List<TextComponent> characters = lexeme.getChildren();
                for (TextComponent character : characters) {
                    CharacterComponent characterComponent = ((CharacterComponent) character);
                    if (characterComponent.getType() == CharacterType.SYMBOL) {
                        sum += 1;
                    }
                }
            }
        }
        return sum;
    }
}
