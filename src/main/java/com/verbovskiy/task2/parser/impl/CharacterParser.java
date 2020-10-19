package com.verbovskiy.task2.parser.impl;

import com.verbovskiy.task2.composite.TextComponent;
import com.verbovskiy.task2.composite.impl.CharacterComponent;
import com.verbovskiy.task2.parser.BaseParser;
import com.verbovskiy.task2.composite.CharacterType;

import java.util.ArrayList;
import java.util.List;

public class CharacterParser implements BaseParser {
    private static final String CHARACTER_REGEX = "";
    private static final String PUNCTUATION_REGEX = "[.]{3}|[.!,?]";

    @Override
    public List<TextComponent> parse(String textComponent) {
        List<TextComponent> symbolComponents = new ArrayList<>();
        String[] symbols = textComponent.split(CHARACTER_REGEX);
        for (String symbol : symbols) {
            if (symbol.matches(PUNCTUATION_REGEX)) {
                symbolComponents.add(new CharacterComponent(symbol, CharacterType.PUNCTUATION));
            } else {
                symbolComponents.add(new CharacterComponent(symbol, CharacterType.SYMBOL));
            }
        }
        return symbolComponents;
    }
}
