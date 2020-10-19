package com.verbovskiy.task2.composite.impl;

import com.verbovskiy.task2.composite.TextComponent;
import com.verbovskiy.task2.composite.CharacterType;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CharacterComponent implements TextComponent {
    private String character;
    private CharacterType type;
    private final Logger logger = LogManager.getLogger(CharacterComponent.class);

    public CharacterComponent(String symbol, CharacterType type) {
        this.character = symbol;
        this.type = type;
    }

    @Override
    public void add(TextComponent component) {
        logger.log(Level.ERROR,"Impossible to add component");
    }

    @Override
    public void remove(TextComponent component) {
        logger.log(Level.ERROR,"Impossible to remove component");
    }

    @Override
    public List<TextComponent> getChildren() {
        logger.log(Level.ERROR,"Impossible to get children components");
        return new ArrayList<>();
    }

    @Override
    public int size() {
        return 1;
    }

    public CharacterType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterComponent characterComponent1 = (CharacterComponent) o;

        if (character == null) {
            if (characterComponent1.character != null) {
                return false;
            }
        } else {
            if (!character.equals(characterComponent1.character)) {
                return false;
            }
        }
        if (type == null) {
            if (characterComponent1.type != null) {
                return false;
            }
        } else {
            if (!type.equals(characterComponent1.type)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + character == null ? 0 : character.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return character;
    }
}
