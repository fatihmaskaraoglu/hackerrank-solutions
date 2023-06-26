package com.myapp.hackerrankssolutions.javabiginteger;

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        BigInteger abig = new BigInteger(A);
        BigInteger bbig = new BigInteger(B);
        BigInteger sum =  BigInteger.valueOf(0);
        BigInteger product =  BigInteger.valueOf(0);
        sum = sum.add(abig);
        sum = sum.add(bbig);
        product = abig.multiply(bbig);
        System.out.println(sum);
        System.out.println(product);
    }
}