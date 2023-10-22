package com.myapp.hackerrankssolutions.javaarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> lines = new ArrayList<List<Integer>>();

        for(int i=0; i<n; i++){
            List<Integer> line = new ArrayList<Integer>();
            int d = scanner.nextInt();
            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt());
            }
            lines.add(line);
        }

        int q = scanner.nextInt();
        for(int i=0; i<q; i++){
            int query1 = scanner.nextInt();
            int query2 = scanner.nextInt();
            if( query2 > lines.get(query1 - 1).size()){
                System.out.println("ERROR!");
            }
            else{
                System.out.println(lines.get(query1 - 1).get(query2 - 1));
            }
        }

        scanner.close();
    }
}
