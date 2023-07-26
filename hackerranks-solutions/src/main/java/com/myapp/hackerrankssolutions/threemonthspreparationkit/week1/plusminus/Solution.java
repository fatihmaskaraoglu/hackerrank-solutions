package com.myapp.hackerrankssolutions.threemonthspreparationkit.week1.plusminus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positive=0;
        int negative=0;
        int zeros=0;
        int total=0;
        for(int a: arr){
            if(a>0){
                positive++;
            }else if(a==0){
                zeros++;
            }else{
                negative++;
            }
        }
        total= positive+negative+zeros;
        BigDecimal totalBig = BigDecimal.valueOf(total);
        System.out.println(BigDecimal.valueOf(positive).divide(totalBig, 6, RoundingMode.HALF_UP));
        System.out.println(BigDecimal.valueOf(negative).divide(totalBig, 6, RoundingMode.HALF_UP));
        System.out.println(BigDecimal.valueOf(zeros).divide(totalBig, 6, RoundingMode.HALF_UP));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}