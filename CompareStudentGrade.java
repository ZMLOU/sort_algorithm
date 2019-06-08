package com.tech.day;

import java.util.Scanner;

public class CompareStudentGrade {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i < n;i++){
                arr[i] = in.nextInt();
            }
            int compare = in.nextInt();
            int count = 0;
            for(int i = 0;i < n;i++){
                if(arr[i] == compare){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
