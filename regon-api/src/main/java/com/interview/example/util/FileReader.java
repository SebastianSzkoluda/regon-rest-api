package com.interview.example.util;

import org.springframework.util.ResourceUtils;

import java.io.File;
import java.nio.file.Files;

public class FileReader {

    public static String readFile(String filename) {
        File file;
        try {
            file = ResourceUtils.getFile("classpath:" + filename);
            return new String(Files.readAllBytes(file.toPath()));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
