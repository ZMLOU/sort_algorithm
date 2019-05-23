package com.tech.day;

public class Reverse {
    public int count(int[] A, int n) {
        // write code here
        if(n > 1){
            int count = 0;
            for(int i = 0;i < n;i++){
                for(int j = i + 1;j < n;j++){
                    if(A[i] > A[j]){
                        count++;
                    }
                }
            }
            return count;
        }
        return 0;
    }
}

