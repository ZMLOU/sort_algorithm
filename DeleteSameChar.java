package com.tech.day;

import java.util.Scanner;

public class DeleteSameChar{
    public static void main(String[] args){
        Scanner sin = new Scanner(System.in);
        String s1 = sin.next();
        String s2 = sin.next();
        int j;
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < s1.length();i++){
            for(j = 0;j < s2.length();j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    break;
                }
            }
            if(j == s2.length() ){
                sb.append(s1.charAt(i));
            }
        }
        System.out.println(sb);
    }
}