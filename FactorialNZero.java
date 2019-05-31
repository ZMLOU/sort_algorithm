package com.tech.day;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorialNZero {
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static List split(int n){
        List<Integer> list = new ArrayList<>();
        while(n != 0){
            int temp = n % 10;
            n /= 10;
            list.add(temp);
        }
        return list;
    }
    public static void main(String[] args){
        Scanner sin = new Scanner(System.in);
        while(sin.hasNext()){
            int count = 0;
            int n = sin.nextInt();
            int result = factorial(n);
            List<Integer> list = split(result);
            while(list.remove(0) == 0){
                count++;
            }
            System.out.println(count);
        }
    }
}
