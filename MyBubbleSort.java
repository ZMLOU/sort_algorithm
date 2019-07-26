package com.tech.day.day2;

import java.util.Arrays;

public class MyBubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,2,11,1,2,8,10,20,19,20,4,1,9,8,6,7,7};
        bubleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubleSort(int[] arr){
        // 走多少趟   例如：右三个元素走两趟就完成排序
        for(int i = 0;i < arr.length - 1;i++){
            //每一趟交换多少次  :第一趟交换2次，第二趟交换1次
            for(int j = 0;j < arr.length - i - 1;j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
