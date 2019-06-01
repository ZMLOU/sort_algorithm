package com.tech.day;

import java.util.Scanner;
public class NEveryCount{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] str = s.toCharArray();
        int[] arr = new int[10];
        for(int i = 0;i < str.length;i++){
            arr[str[i] - '0']++;
        }
        for(int i = 0;i < arr.length ;i++){
            if(arr[i] != 0){
                System.out.println(i + ":" + arr[i]);
            }
        }
    }
}
