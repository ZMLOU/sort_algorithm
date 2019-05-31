package com.tech.day;

import java.util.Scanner;

public class NString {
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        while(sin.hasNext()){
            String s = sin.nextLine();
            StringBuilder sb = new StringBuilder(s);
            int n = sin.nextInt();
            while (n > 0){
                int start = sin.nextInt();
                int len = sin.nextInt();
                sb.append(reverse(sb.substring(start,start + len)));
                n--;
            }
            System.out.println(sb);
        }
    }
}
