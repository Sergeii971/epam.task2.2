package test.verbovskiy.task2.data_provider;

public class TextDataProvider {
    public static final String TEXT = " It has survived - not only (five) centuries, but also the leap into\n" +
            "electronic typesetting, remaining 3+5 essentially 6+9*(3-4) unchanged. It was\n" +
            "popularised in the 5*(1*2*(3*(4*(5+4)-3)-2)-1) with the release of Letraset sheets\n" +
            "containing Lorem Ipsum passages, and more recently with desktop publishing software\n" +
            "like Aldus PageMaker including versions of Lorem Ipsum.\n" +
            " It is a long established fact that a reader will be distracted by the readable\n" +
            "content of a page when looking at its layout. The point of using (71-(2*(3*(2-1/2*2)-2)-10/2))\n" +
            " Ipsum is that it has a more-or-less normal distribution of letters, as\n" +
            "opposed to using (Content here), content here', making it look like readable English.\n" +
            "It is a (-5+1/2*(2+5*2))*1200 established fact that a reader will be of a page\n" +
            "when looking at its layout.\n" +
            " Bye.";
    public static final String TEXT_FOR_SORTING_SENTENCES_BY_LEXEME_LENGTH = "It has survived - not only " +
            "(five)" +
            " centuries, but also the leap into\n" +
            "electronic typesetting, remaining 3+5 essentially 6+9*(3-4) unchanged. Bye.";
    public static final String SORTED_TEXT_BY_SENTENCE_LEXEME_LENGTH = "[ Bye , It has survived - " +
            "not only (five) centuries, but also the leap into " +
            "electronic typesetting, remaining 8 essentially -3 unchanged ]";
    public static final String TEXT_FOR_SORTING_SENTENCES_BY_WORD_LENGTH = "It has survived - not only " +
            "(five)" +
            " centuries, but also the leap into\n" +
            "electronic typesetting, remaining 3+5 essentially 6+9*(3-4) unchanged. Bye.";
    public static final String SORTED_TEXT_BY_SENTENCE_WORD_LENGTH = "[ Bye , It has survived - " +
            "not only (five) centuries, but also the leap into " +
            "electronic typesetting, remaining 8 essentially -3 unchanged ]";
    public static final String TEXT_FOR_SORTING_PARAGRAPHS_BY_SENTENCE_NUMBER = "It is a long established fact " +
            "that a reader will be distracted by the readable\n" +
            "content of a page when looking at its layout. The point of using (71-(2*(3*(2-1/2*2)-2)-10/2))\n" +
            " Ipsum is that it has a more-or-less normal distribution of letters, as\n" +
            "opposed to using (Content here), content here', making it look like readable English.\n" +
            "It is a (-5+1/2*(2+5*2))*1200 established fact that a reader will be of a page\n" +
            "when looking at its layout.\n" +
            " Bye.";
    public static final String SORTED_TEXT_BY_PARAGRAPH_SENTENCE_NUMBER = "[Bye , It is a long established" +
            " fact that a reader will be distracted by the readable content of a page when looking at its" +
            " layout  The point of using 74.0 , Ipsum is that it has a more-or-less normal distribution" +
            " of letters, as opposed to using (Content here), content here', making it look like readable English" +
            "  It is a 1200.0 established fact that a reader will be of a page when looking at its layout ]";
    public static final String TEXT_FOR_SORTING_LEXEMES_BY_CHARACTER_ENTRIES = "It has survived - not only (five)" +
            " centuries, but also the leap into electronic typesetting, remaining 3+5 essentially 6+9*(3-4) unchanged.";
    public static final String SORTED_TEXT_BY_LEXEME_CHARACTER_ENTRIES = "[typesetting,, essentially, centuries,," +
            " electronic, unchanged., remaining, survived, (five), also, into, leap, only, but, has, not, the, -3," +
            " It, -, 8]\n";
}
