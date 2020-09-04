package com.venkat.modules;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class FileHelper {

    public List<String>  readFile(String fileName){

        List<String> lines=null;

        try {
            lines = FileUtils.readLines( new File(fileName), StandardCharsets.UTF_8 );
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }
}
