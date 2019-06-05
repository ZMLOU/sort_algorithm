package com.tech.day;

import java.util.Scanner;
//
//public class GetSequeOddNum {
//    public static String GetSequeOddNum(int m){
//        if(m == 1){
//            return String.valueOf(1);
//        }
//        StringBuilder sb = new StringBuilder();
//        int result = (m - 1) * m + 1;
//        for(int i = 1;i < m;i++){
//            sb.append(result + "+");
//            result += 2;
//        }
//        sb.append(result);
//        return String.valueOf(sb);
//    }
//    public static void main(String[] ags){
//        Scanner in = new Scanner(System.in);
//        int m = in.nextInt();
//        String s = GetSequeOddNum(m);
//        System.out.println(s);
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class GetSequeOddNum{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=bf.readLine())!=null){
            long m = Integer.valueOf(s);
            long a = m*m-m+1;//计算首项
            System.out.print(a);
            for(int i=1; i<m; i++){//继续等差数列求和
                System.out.print("+"+(a+=2));
            }
            System.out.println();
        }
        bf.close();
    }
}
