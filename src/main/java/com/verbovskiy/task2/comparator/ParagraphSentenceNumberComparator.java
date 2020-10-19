package com.verbovskiy.task2.comparator;

import com.verbovskiy.task2.composite.TextComponent;

import java.util.Comparator;

public class ParagraphSentenceNumberComparator implements Comparator<TextComponent> {
    @Override
    public int compare(TextComponent paragraph1, TextComponent paragraph2) {
        return Integer.compare(paragraph1.size(), paragraph2.size());
    }
}
