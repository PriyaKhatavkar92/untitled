package org.example;

import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseInt {

    public static void main(String[] args) {
        //Option 1
        int x= -123456789;

        int reverse=0;
        int lastdigit;
        while(x!=0){
            lastdigit = x%10;
            reverse=reverse*10+lastdigit;
            x=x/10;
        }
        System.out.println(reverse);

        //Option 2
        int i=-12345;
        StringBuffer buffer = new StringBuffer(String.valueOf(i));
        System.out.println(buffer.reverse());

    }
}
