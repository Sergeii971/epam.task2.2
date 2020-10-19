package com.verbovskiy.task2.service;

import com.verbovskiy.task2.comparator.*;
import com.verbovskiy.task2.composite.TextComponent;
import com.verbovskiy.task2.exception.TaskException;
import com.verbovskiy.task2.parser.BaseParser;
import com.verbovskiy.task2.parser.impl.LexemeParser;
import com.verbovskiy.task2.parser.impl.ParagraphParser;
import com.verbovskiy.task2.parser.impl.SentenceParser;

import java.util.List;

public class TextService {
    public List<TextComponent> sortSentencesByLexemeLength(String textComponent) throws TaskException {
        BaseParser parser = new SentenceParser();
        List<TextComponent> sortedSentences = parser.parse(textComponent);
        sortedSentences.sort(new SentenceLexemeLengthComparator());
        return sortedSentences;
    }

    public List<TextComponent> sortSentencesByWordLength(String textComponent) throws TaskException {
        BaseParser parser = new SentenceParser();
        List<TextComponent> sortedSentences = parser.parse(textComponent);
        sortedSentences.sort(new SentenceWordLengthComparator());
        return sortedSentences;
    }

    public List<TextComponent> sortParagraphsBySentenceNumber(String textComponent) throws TaskException {
        BaseParser parser = new ParagraphParser();
        List<TextComponent> sortedParagraphs = parser.parse(textComponent);
        sortedParagraphs.sort(new ParagraphSentenceNumberComparator());
        return sortedParagraphs;
    }

    public List<TextComponent> sortLexemesByCharacterEntries(char symbol, String textComponent)
            throws TaskException {
        BaseParser parser = new LexemeParser();
        List<TextComponent> sortedLexemes = parser.parse(textComponent);
        sortedLexemes.sort(new CharacterEntriesLexemeComparator(symbol).reversed()
                .thenComparing(new AlphabeticLexemeComparator()));
        return sortedLexemes;
    }
}
