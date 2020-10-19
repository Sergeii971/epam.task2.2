package com.verbovskiy.task2.parser.impl;

import com.verbovskiy.task2.composite.impl.CharacterComponent;
import com.verbovskiy.task2.composite.CharacterType;
import com.verbovskiy.task2.composite.ComponentType;
import com.verbovskiy.task2.composite.TextComponent;
import com.verbovskiy.task2.composite.impl.TextComposite;
import com.verbovskiy.task2.exception.TaskException;
import com.verbovskiy.task2.parser.BaseParser;

import java.util.ArrayList;
import java.util.List;

public class SentenceParser implements BaseParser {
    private final String SENTENCE_REGEX = "[.]{3}|[.!?]";
    private final BaseParser nextParser = new LexemeParser();

    @Override
    public List<TextComponent> parse(String textComponent) throws TaskException {
        List<TextComponent> componentSentences = new ArrayList<>();
        String[] sentences = textComponent.split(SENTENCE_REGEX);

        for (String sentence : sentences) {
            TextComponent componentSentence = new TextComposite(ComponentType.SENTENCE);
            List<TextComponent> componentLexemes = nextParser.parse(sentence);
            for (TextComponent componentLexeme : componentLexemes) {
                componentSentence.add(componentLexeme);
                componentSentence.add(new CharacterComponent(" ", CharacterType.SYMBOL));
            }
            componentSentences.add(componentSentence);
        }
        return componentSentences;
    }
}
