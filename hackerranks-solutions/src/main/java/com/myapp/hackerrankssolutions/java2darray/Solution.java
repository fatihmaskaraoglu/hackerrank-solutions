package com.myapp.hackerrankssolutions.java2darray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int greatest=-82; //if all value is negative 9
        int hourg=0;

        for(int x=0;x<4;x++){
            for(int y=0;y<4;y++){
                hourg+=arr.get(x).get(y)+arr.get(x).get(y+1)+arr.get(x).get(y+2);
                hourg+=arr.get(x+1).get(y+1);
                hourg+=arr.get(x+2).get(y)+arr.get(x+2).get(y+1)+arr.get(x+2).get(y+2);

                if(hourg>greatest){
                    greatest=hourg;
                }

                hourg=0;
            }



        }
        System.out.println(greatest);
        bufferedReader.close();
    }
}