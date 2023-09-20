package com.myapp.hackerrankssolutions.javahashset;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> hs = new HashSet<String>();
        for(int i=0; i<t; i++){
            hs.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(hs.size());
        }
        /* can't do with list bcs lose time when countains searching
        List<String> pairs = new ArrayList<>();

        for(int i=0; i<t ;i++){
            String temp = pair_left[i] + pair_right[i];
            if(!pairs.contains(temp)){
                pairs.add(temp);
            }
            System.out.println(pairs.size());
        }
        */
    }
}