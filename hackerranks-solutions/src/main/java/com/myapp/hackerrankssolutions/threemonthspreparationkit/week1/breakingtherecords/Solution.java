package com.myapp.hackerrankssolutions.threemonthspreparationkit.week1.breakingtherecords;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> resultList = new ArrayList<>();
        int min = scores.get(0);
        int max = scores.get(0);
        int minChangeCount=0;
        int maxChangeCount=0;
        for(int i=0; i< scores.size(); i++){
            if(scores.get(i)<min){
                min = scores.get(i);
                minChangeCount++;
            }
        }
        for(int i=0; i< scores.size(); i++){
            if(scores.get(i)>max){
                max = scores.get(i);
                maxChangeCount++;
            }
        }
        resultList.add(maxChangeCount);
        resultList.add(minChangeCount);
        return resultList;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
