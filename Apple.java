package com.tech.day;

import java.util.Scanner;

public class Apple{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            if(n % 2 != 0 || n == 10 || n < 6)
                System.out.println(-1);
            else if(n % 8 == 0)
                System.out.println(n / 8);
            else
                System.out.println(n / 8 + 1);
        }
    }
}