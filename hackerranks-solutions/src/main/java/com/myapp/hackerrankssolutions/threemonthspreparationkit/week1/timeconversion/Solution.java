package com.myapp.hackerrankssolutions.threemonthspreparationkit.week1.timeconversion;

import java.io.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        int hour = Integer.valueOf(s.substring(0, 2));
        if(s.substring(8, 10).equals("PM")){
            if(hour<12){
                hour = hour+12;
            }
            return hour + s.substring(2, 8);
        }else{
            if(hour<12){
                return s.substring(0, 8);
            }
            if(hour==12){
                return "00" + s.substring(2, 8);
            }
            if(hour>12){
                hour = hour-12;
                return hour + s.substring(2, 8);
            }
        }
        return null;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
