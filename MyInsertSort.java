package com.tech.day.day2;

import java.util.Arrays;

public class MyInsertSort {
    public static void main(String[] args) {
        int[] arr = {3,2,11,1,2,8,10,20,19,20,4,1,9,8,6,7,7};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int[] arr){
        for(int i = 1;i < arr.length;i++){//假设第一个元素是有序的，后面的都要插入排序
            if(arr[i] < arr[i - 1]){//当前元素 < 有序序列中的最后一个元素的情况
                int j = 0; //方便查找小于或等于tmp 元素的位置
                int tmp = arr[i];//将当前元素存起来，以便其前面的元素后移
                for(j = i - 1;j >= 0;j--){//从后向前找要插入的位置
                    if(arr[j] > tmp){
                        arr[j + 1] = arr[j];
                    }else {
                        break;//找到 <= tmp的值的位置
                    }
                }
                arr[j + 1] = tmp;//将tmp放到 小于或等于tmp这个元素的后一个位置
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
