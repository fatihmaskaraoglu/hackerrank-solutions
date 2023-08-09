package com.myapp.hackerrankssolutions.threemonthspreparationkit.week2.pangrams;

import java.io.*;
import java.util.HashSet;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        HashSet<Character> set = new HashSet<>();
        s = s.toLowerCase();
        for (char c : s.toCharArray()){
            if (Character.isLetter(c)){
                set.add(c);
            }
        }
        if (set.size() == 26){
            return "pangram";
        }
        return "not pangram";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
