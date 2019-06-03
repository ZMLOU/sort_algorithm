package com.tech.day;

public class GrayCode {
    public static String[] getGray(int n) {
        String[] s = null;
        if(n == 1){
            s = new String[]{"0","1"};
        }else{
            String[] s1 = getGray(n - 1);
            s = new String[2 * s1.length];
            for(int i = 0;i < s1.length;i++){
                s[i] = "0" + s1[i];
                s[s.length - 1 - i] = "1" + s1[i];
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String[] str = getGray(5);
        for(int i = 0; i < str.length;i++){
            System.out.println(str[i]);
        }
    }
}
