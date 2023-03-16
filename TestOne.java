package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

public class TestOne {

    public static void main(String args[]){
        HashMap<Integer , String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2 , "two");
        map.put(2 ,"three");
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry <Integer , String> element = (Map.Entry<Integer, String>) it.next();
            System.out.println("key: "+ element.getKey()+"val :"+ element.getValue());
        }

        Optional GOT = Optional.of("Gamr");
        String str[] = new String[10];
       // str[9]="rer";
        Optional strOptional = Optional.ofNullable(str[9]);
        System.out.println(strOptional.isPresent());
        System.out.println(GOT.isPresent());
    }
}
