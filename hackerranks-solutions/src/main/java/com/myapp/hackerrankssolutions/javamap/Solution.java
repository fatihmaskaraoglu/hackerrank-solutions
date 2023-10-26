package com.myapp.hackerrankssolutions.javamap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String, Integer> map=new HashMap<String, Integer>();
        for(int i=0;i<n;i++)
        {
            String name= in.nextLine();
            Integer num= Integer.valueOf(in.nextLine());
            map.put(name,num);
        }
        while(in.hasNext())
        {
            String cmd=in.nextLine();
            if(map.get(cmd)!=null) System.out.println(cmd+"="+map.get(cmd));
            else System.out.println("Not found");
        }
    }
}
