package com.tech.day.day2;

import java.util.Arrays;

public class MySelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,11,1,2,8,10,20,19,20,4,1,9,8,6,7,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        //找小元素的趟数：假如有3个元素，只需要2趟，i是每次找到的最小元素要放的位置
        for(int i = 0;i < arr.length - 1;i++){
            int min = i;//假设最下元素在i处
            for(int j = i + 1;j < arr.length;j++){
                if(arr[j] < arr[min]){ //将i后面的元素与第i个元素做比较
                    min = j;//更新最小元素的位置
                }
            }
            swap(arr,i,min);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
