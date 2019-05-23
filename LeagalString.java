package com.tech.day;

import java.util.Stack;

public class LeagalString {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        if(n % 2 == 0){
            Stack s = new Stack();
            char[] a = A.toCharArray();
            for(int i = 0;i < n;i++){
                if(a[i] != '('){
                    s.push(a[i]);
                }
                if(!s.empty() && a[i] == ')'){
                    s.pop();
                }
            }
            if(s.empty()){
                return true;
            }
            return false;
        }
        return false;
    }
}