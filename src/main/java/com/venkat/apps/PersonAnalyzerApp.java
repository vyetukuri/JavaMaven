package com.venkat.apps;

import com.venkat.examples.PersonAnalyzer;
import com.venkat.modules.FileHelper;

import java.util.List;

public class PersonAnalyzerApp {

    public static void main(String args[])
    {
        FileHelper helper = new FileHelper();
        List<String> lines =
                helper.readFile( "C:\\Users\\vyetukuri\\Selenium\\JavaIntellij\\inputData\\personData" );
        PersonAnalyzer analyzer  = new PersonAnalyzer(lines);
        analyzer.printCityReport();
    }
}
