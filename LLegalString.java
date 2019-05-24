package com.tech.day;

import java.util.Stack;

public class LLegalString{
    public boolean isValid(String s) {
        if(s.length() % 2 == 0){
            Stack<Character> si = new Stack<>();
            char[] a = s.toCharArray();
            for(int i = 0;i < a.length;i++){
                if(a[i] == '(' || a[i] == '{' || a[i] == '['){
                    si.push(a[i]);
                }
                if(!si.empty() && ((a[i] == ')' && si.peek() == ('(')) ||
                        (a[i] == '}' && si.peek() == ('{')) || (a[i] == ']' && si.peek() == ('[')))) {

                    si.pop();
                }
            }
            if(si.empty()){
                return true;
            }
            return false;
        }
        return false;
    }
}
