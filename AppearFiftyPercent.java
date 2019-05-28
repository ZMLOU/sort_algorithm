package com.tech.day;

import java.util.Scanner;

public class AppearFiftyPercent {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        while(sin.hasNext()){
            String s = sin.next();
            int count = 0;
            String[] arr = s.split(" ");
            int[] a = new int[arr.length];
            for(int i = 0; i < a.length;i++){
                a[i] = Integer.valueOf(arr[i]);
            }
            int result = 0;
            for(int i = 0;i < a.length;i++){
                if(count == 0){
                    result = a[i];
                    count = 1;
                }
                if(a[i] == result){
                    count++;
                }else {
                    count--;
                }
            }
            System.out.println(result);
        }
    }
}

