package com.verbovskiy.task2.comparator;

import com.verbovskiy.task2.composite.TextComponent;

import java.util.Comparator;

public class SentenceLexemeLengthComparator implements Comparator<TextComponent> {
    @Override
    public int compare(TextComponent sentence1, TextComponent sentence2) {
        return Integer.compare(sentence1.size(), sentence2.size());
    }
}
