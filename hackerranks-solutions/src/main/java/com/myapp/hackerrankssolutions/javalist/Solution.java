package com.myapp.hackerrankssolutions.javalist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> data = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int arrayFirstLength = scanner.nextInt();
        for(int i=0; i < arrayFirstLength; i++){
            data.add(scanner.nextInt());
        }

        int querySize = scanner.nextInt();
        for(int i=0; i<querySize; i++){
            String operation = scanner.next();
            if(operation.equals("Insert")){
                data.add(scanner.nextInt(), scanner.nextInt());
            }
            if(operation.equals("Delete")){
                data.remove(scanner.nextInt());
            }
        }
        for (Integer i : data) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}