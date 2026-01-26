package org.java.lists;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ExamplesList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //List instance
        List<String> listString = new ArrayList<>();

        //Add values in list
        listString.add("Hernando");
        listString.add("Maria");
        listString.add("Eduarda");

        //Print values in listString
        for (String name : listString){
            System.out.println(name);
        }

        System.out.println("----------------------------------");

        //Use predicate to remove values in list
        listString.removeIf(x -> x.charAt(0) == 'M');

        //Print values in listString
        for (String name : listString){
            System.out.println(name);
        }

        System.out.println("----------------------------------");

        //Filter elements by inital letter is 'A'
        List<String> listFilter = listString.stream().filter(x -> x.charAt(0) == 'H').toList();

        for (String name : listFilter){
            System.out.println(name);
        }
    }
}
