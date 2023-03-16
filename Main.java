package org.example;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

//To 2 sorted array to a final sorted array integers
public class Main {

    public static void main(String args[]){

        System.out.println("Hello"+ ZonedDateTime.now());

        ArrayList<Integer> array1 = inputArray1(1, 2, 3);

        ArrayList<Integer> array2 = inputArray1(4, 5, 6);

        ArrayList <Integer> output = new ArrayList<Integer>();
        output.addAll(array1);
        output.addAll(array2);

        System.out.println(Arrays.stream(output.toArray()).sorted().collect(Collectors.toList()));

        System.out.println("Hello"+ ZonedDateTime.now().getSecond());
    }

    private static ArrayList<Integer> inputArray1(int e, int e1, int e2) {
        ArrayList <Integer> array1 = new ArrayList<Integer>();
        array1.add(e);
        array1.add(e1);
        array1.add(e2);
        return array1;
    }

}