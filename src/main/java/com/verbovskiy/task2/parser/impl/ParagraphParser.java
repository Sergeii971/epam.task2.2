package com.verbovskiy.task2.parser.impl;

import com.verbovskiy.task2.composite.ComponentType;
import com.verbovskiy.task2.composite.TextComponent;
import com.verbovskiy.task2.composite.impl.TextComposite;
import com.verbovskiy.task2.exception.TaskException;
import com.verbovskiy.task2.parser.BaseParser;

import java.util.ArrayList;
import java.util.List;

public class ParagraphParser implements BaseParser {
    private static final String PARAGRAPH_REGEX = "\\n\\s";
    private static final BaseParser nextParser = new SentenceParser();

    @Override
    public List<TextComponent> parse(String textComponent) throws TaskException {
        List<TextComponent> componentParagraphs = new ArrayList<>();
        String[] paragraphs = textComponent.split(PARAGRAPH_REGEX);

        for(String paragraph : paragraphs) {
            TextComponent componentParagraph = new TextComposite(ComponentType.PARAGRAPH);
            List<TextComponent> componentSentences = nextParser.parse(paragraph);
            for(TextComponent componentSentence : componentSentences) {
                componentParagraph.add(componentSentence);
            }
            componentParagraphs.add(componentParagraph);
        }
        return componentParagraphs;
    }
}
