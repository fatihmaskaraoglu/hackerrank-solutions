package com.myapp.hackerrankssolutions.regex;

import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {
    String A = "([01]?[0-9]{1,2}|"; //000-199
    String B = "2[0-4][0-9]|"; //200-249
    String C = "25[0-5])"; // 250-255
    String num = A+B+C;  // has allow range 000 - 255
    String pattern = num+"."+num+"."+num+"."+num;
}