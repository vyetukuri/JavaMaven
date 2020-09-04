package com.venkat.examples;

import com.venkat.domain.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonAnalyzer {

    List<Person> people = new ArrayList<Person>();
    Map<String, Integer> countCityMap = new HashMap<String, Integer>();

    public PersonAnalyzer(){
        super();
        processData();
    }
    public PersonAnalyzer(List<String> peopleStrings){

        for(int i=0;i<peopleStrings.size();i++){
            String [] splitStrings = peopleStrings.get( i ).split( "," );
            Person aPerson = new Person();
            aPerson.setName( splitStrings[0] );
            aPerson.setCity( splitStrings[1] );
            aPerson.setState( splitStrings[2] );
            aPerson.setCountry( splitStrings[3] );

            people.add( aPerson );
        }

    }
    private void processData(){

        List<String> personStrings = new ArrayList<String>();

        personStrings.add( "Venkat,Cary,NC,USA" );
        personStrings.add("Siva,Morrisville,NC,USA");
        personStrings.add("Siva,Raliegh,NC,USA");
        personStrings.add("Siva,Cary,NC,USA");

        for(int i=0;i<personStrings.size();i++){
            String [] splitStrings = personStrings.get( i ).split( "," );
            Person aPerson = new Person();
            aPerson.setName( splitStrings[0] );
            aPerson.setCity( splitStrings[1] );
            aPerson.setState( splitStrings[2] );
            aPerson.setCountry( splitStrings[3] );

            people.add( aPerson );
        }
    }
    public void printCityReport(){
        String city;
        int count;
        for(int i=0;i<people.size();i++){
            city = people.get( i ).getCity();
            if(countCityMap.get(city)==null){
                countCityMap.put(city, Integer.valueOf( 1 )  );
            }else{
                count = countCityMap.get( city ).intValue();
                countCityMap.put( city, Integer.valueOf( count+1 ) );
            }
        }
        // iterate thru the map and print values
        for (Map.Entry<String, Integer> entry : countCityMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
//    public void printStateReport(){
//        String state;
//        int count;
//        for(int i=0;i<people.size();i++){
//            city = people.get( i ).getCity();
//            if(countCityMap.get(city)==null){
//                countCityMap.put(city, Integer.valueOf( 1 )  );
//            }else{
//                count = countCityMap.get( city ).intValue();
//                countCityMap.put( city, Integer.valueOf( count+1 ) );
//            }
//        }
//        // iterate thru the map and print values
//        for (Map.Entry<String, Integer> entry : countCityMap.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
//    }
}
