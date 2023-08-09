package com.myapp.hackerrankssolutions.threemonthspreparationkit.week2.countingvalleys;

import java.io.*;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int situation=0;
        int tempValley=0;
        int count=0;
        for(int i=0; i<steps;i++){
            if(path.substring(i,i+1).equals("U")){
                situation = situation + 1;
            }else{
                situation = situation - 1;
            }
            if(tempValley < 0 && situation == 0){
                count =  count + 1 ;
            }
            tempValley = situation;
        }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
