package com.leh.tplanet;

import org.springframework.stereotype.Component;
import org.thymeleaf.standard.processor.StandardObjectTagProcessor;

import java.util.Arrays;

@Component
public class AddDigits {
//    public void getUniqueArray( String [] multiArray) {
//    }

    public String getSum( String digitString ) {
        int sum =0;
        String[] digitChar = digitString.split("");
        sum = sumUP(digitChar, 0);
        return Integer.toString(sum);
    }
    int count =0;
    // Recursive function to calculate the sum of the digits
    private int sumUP(String [] sm, int Total) {
        Total = Total + Integer.parseInt(sm[count]);
        count++;
        System.out.println(count);
        if(count != sm.length)
            sumUP( sm, Total);
        return Total;
    }
}
