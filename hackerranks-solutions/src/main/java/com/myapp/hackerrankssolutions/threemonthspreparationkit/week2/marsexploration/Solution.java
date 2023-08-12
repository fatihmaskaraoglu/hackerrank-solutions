package com.myapp.hackerrankssolutions.threemonthspreparationkit.week2.marsexploration;

import java.io.*;

class Result {
    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static int marsExploration(String s) {
        // Write your code here
        int changedLetters = 0;
        for(int i =0; i< s.length();){
            if(!s.substring(i, i+1).equals("S")){
                changedLetters++;
            }
            if(!s.substring(i+1, i+2).equals("O")){
                changedLetters++;
            }
            if(!s.substring(i+2, i+3).equals("S")){
                changedLetters++;
            }
            i = i + 3;
            if(i > s.length()){
                return changedLetters;
            }
        }
        return changedLetters;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
