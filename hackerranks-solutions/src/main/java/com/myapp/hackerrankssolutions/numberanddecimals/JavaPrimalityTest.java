package com.myapp.hackerrankssolutions.numberanddecimals;


import java.io.*;
import java.math.*;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        BigInteger big = new BigInteger(n);
        if (big.isProbablePrime(1) == true) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
