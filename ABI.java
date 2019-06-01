package com.tech.day;

public class ABI {
        public static int[] multiply(int[] A) {
            int len = A.length;
            int[] B = new int[len];
            if(len != 0){
                //计算下三角
                B[0] = 1;
                for(int i = 1;i < len ;i++){
                    B[i] = A[i - 1] * B[i - 1];
                }
                int temp = 1;
                for(int i = len - 2;i >= 0;i--){
                    temp *= A[i + 1];
                    B[i] *= temp;
                }
            }
            return B;
        }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] b = multiply(arr);
        for(int i = 0; i < b.length;i++){
            System.out.print(b[i] + " ");
        }
    }
}
