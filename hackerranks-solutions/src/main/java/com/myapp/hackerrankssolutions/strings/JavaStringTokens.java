package com.myapp.hackerrankssolutions.strings;

import java.io.*;
import java.util.*;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = removeLeadingNonLetters(s);
        if(s.trim().isEmpty()){
            System.out.println(0);
        }else{
            String[] response = s.split("[^a-zA-Z]+");
            System.out.println(response.length);
            for(String elem : response){
                System.out.println(elem);
            }
        }
        scan.close();
    }

    private static String removeLeadingNonLetters(String str) {
        int i;
        for (i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                break;
            }
        }
        return str.substring(i);
    }
}
