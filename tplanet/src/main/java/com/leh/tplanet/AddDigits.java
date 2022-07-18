package com.leh.tplanet;

import org.springframework.stereotype.Component;
import org.thymeleaf.standard.processor.StandardObjectTagProcessor;

import java.util.Arrays;

@Component
public class AddDigits {

    int count, totalSum;
//    public void getUniqueArray( String [] multiArray) {
//    }

    public String getSum( String digitString ) {
        int sum =0;
        String[] digitChar = digitString.split("");
        count =0;
        totalSum =0;
        sum = sumUP(digitChar);
        return Integer.toString(sum);
    }

    // Recursive function to calculate the sum of the digits
    private int sumUP(String [] sm) {
        totalSum += Integer.parseInt(sm[count]);
        count++;
        if(count != sm.length)
            sumUP( sm );
        return totalSum;
    }
}
