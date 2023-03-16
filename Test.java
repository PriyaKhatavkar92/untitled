package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test {

    Integer num;

    public void add(int num){
       //array.add(this.num);
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }



    public static void main(String args[]){


        System.out.println("Hello");
        Integer[] array= new Integer[10];
        Arrays.sort(array, Collections.reverseOrder());


    }

}
