package test.verbovskiy.task2.service;

import com.verbovskiy.task2.composite.TextComponent;
import com.verbovskiy.task2.exception.TaskException;
import com.verbovskiy.task2.service.TextService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import test.verbovskiy.task2.data_provider.TextDataProvider;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class TextServiceTest {
    private TextService service;

    @BeforeClass
    public void setUp() {
        service = new TextService();
    }

    @Test
    public void sortSentencesByLexemeLengthPositiveTest() throws TaskException {
        List<TextComponent> sortedSentences = service.sortSentencesByLexemeLength(TextDataProvider
                .TEXT_FOR_SORTING_SENTENCES_BY_LEXEME_LENGTH);
        String actual = sortedSentences.toString();
        String expected = TextDataProvider.SORTED_TEXT_BY_SENTENCE_LEXEME_LENGTH;
        assertEquals(actual, expected);
    }

    @Test
    public void sortSentencesByLexemeLengthNegativeTest() throws TaskException {
        List<TextComponent> sortedSentences = service.sortSentencesByLexemeLength(TextDataProvider
                .TEXT_FOR_SORTING_SENTENCES_BY_LEXEME_LENGTH);
        String actual = sortedSentences.toString();
        String expected = "";
        assertNotEquals(actual, expected);
    }

    @Test
    public void sortSentencesByWordLengthPositiveTest() throws TaskException {
        List<TextComponent> sortedSentences = service.sortSentencesByWordLength(TextDataProvider
                .TEXT_FOR_SORTING_SENTENCES_BY_WORD_LENGTH);
        String actual = sortedSentences.toString();
        String expected = TextDataProvider.SORTED_TEXT_BY_SENTENCE_WORD_LENGTH;
        assertEquals(actual, expected);
    }

    @Test
    public void sortSentencesByWordLengthNegativeTest() throws TaskException {
        List<TextComponent> sortedSentences = service.sortSentencesByWordLength(TextDataProvider
                .TEXT_FOR_SORTING_SENTENCES_BY_WORD_LENGTH);
        String actual = sortedSentences.toString();
        String expected = "";
        assertNotEquals(actual, expected);
    }

    @Test
    public void sortParagraphsBySentenceNumberPositiveTest() throws TaskException {
        List<TextComponent> sortedParagraph = service.sortParagraphsBySentenceNumber(TextDataProvider
                .TEXT_FOR_SORTING_PARAGRAPHS_BY_SENTENCE_NUMBER);
        String actual = sortedParagraph.toString();
        String expected = TextDataProvider.SORTED_TEXT_BY_PARAGRAPH_SENTENCE_NUMBER;
        assertEquals(actual, expected);
    }

    @Test
    public void sortParagraphsBySentenceNumberNegativeTest() throws TaskException {
        List<TextComponent> sortedParagraph = service.sortParagraphsBySentenceNumber(TextDataProvider
                .TEXT_FOR_SORTING_PARAGRAPHS_BY_SENTENCE_NUMBER);
        String actual = sortedParagraph.toString();
        String expected = "";
        assertNotEquals(actual, expected);
    }

    @Test
    public void sortLexemesByCharacterEntriesPositiveTest() throws TaskException {
        List<TextComponent> sortedLexemes = service.sortLexemesByCharacterEntries('i', TextDataProvider
                .TEXT_FOR_SORTING_LEXEMES_BY_CHARACTER_ENTRIES);
        String actual = sortedLexemes.toString();
        String expected = TextDataProvider.SORTED_TEXT_BY_LEXEME_CHARACTER_ENTRIES;
        assertNotEquals(actual, expected);
    }

    @Test
    public void sortLexemesByCharacterEntriesNegativeTest() throws TaskException {
        List<TextComponent> sortedLexemes = service.sortLexemesByCharacterEntries('i', TextDataProvider
                .TEXT_FOR_SORTING_LEXEMES_BY_CHARACTER_ENTRIES);
        String actual = sortedLexemes.toString();
        String expected = "";
        assertNotEquals(actual, expected);
    }
}