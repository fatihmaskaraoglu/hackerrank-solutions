package com.myapp.hackerrankssolutions.threemonthspreparationkit.week1.minmaxsum;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        List<Integer> sortedarr = arr.stream().sorted().collect(Collectors.toList());
        Long minSum =
                Long.valueOf(sortedarr.get(0))+
                        Long.valueOf(sortedarr.get(1))+
                        Long.valueOf(sortedarr.get(2))+
                        Long.valueOf(sortedarr.get(3));
        Long maxSum =
                Long.valueOf(sortedarr.get(1))+
                        Long.valueOf(sortedarr.get(2))+
                        Long.valueOf(sortedarr.get(3))+
                        Long.valueOf(sortedarr.get(4));
        System.out.println(minSum +" " + maxSum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
