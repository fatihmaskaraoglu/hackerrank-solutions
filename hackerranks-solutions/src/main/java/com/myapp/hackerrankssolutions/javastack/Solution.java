package com.myapp.hackerrankssolutions.javastack;

import java.util.Scanner;
import java.util.Stack;

class Solution {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            Stack<Character> stack = new Stack<>();
            int n = input.length();
            for (int i = 0; i < n; i++) {
                char ch = input.charAt(i);
                if (!stack.isEmpty() &&
                        ((stack.peek() == '{' && ch == '}') ||
                                (stack.peek() == '(' && ch == ')') ||
                                (stack.peek() == '[' && ch == ']')
                        )) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
            if (stack.isEmpty()) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}