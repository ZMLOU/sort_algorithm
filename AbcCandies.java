package com.tech.day;

import java.util.Scanner;

public class AbcCandies{
    public static void main(String[] args){
        int[] a = new int[4];
        Scanner in = new Scanner(System.in);

        for(int i = 0;i < a.length;i++){
            a[i] = in.nextInt();
        }
        float A = (a[0] + a[2]) / 2f;
        float B = (a[1] + a[3]) / 2f;
        float C = (a[3] - a[1]) / 2f;
        if(A - (a[0] + a[2]) / 2 != 0 || B - (a[1] + a[3]) / 2 != 0 || B - (a[2] - a[0]) / 2 != 0 || C - (a[3] - a[1])/2 != 0){
            System.out.print("No");
            return;
        }
        else{
            System.out.print((a[0] + a[2]) / 2 + " ");
            System.out.print((a[1] + a[3]) / 2 + " ");
            System.out.print((a[3] - a[1])/2);
        }

    }
}