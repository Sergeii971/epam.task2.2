package com.verbovskiy.task2.reader;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextReader {
    private static Logger logger = LogManager.getLogger(TextReader.class);

    public String readFileData(String fileName) {
        String text = "";
        try {
        byte[] textByteFormat = Files.readAllBytes(Paths.get(fileName));
        text = new String(textByteFormat);
        logger.log(Level.INFO,"file was successfully read!");
        } catch (IOException e) {
            logger.log(Level.FATAL,"Error while reading file!", e);
        }
        return text;
    }
}
