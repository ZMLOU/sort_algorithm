package com.tech.day.day16;

import java.util.Arrays;

public class MyQuickSort {
    public static void main(String[] args) {
        int[] arr = {3,2,11,1,2,8,10,20,19,20,4,1,9,8,6,7,7};
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int l,int r){
        if(l >= r){ //分区只剩一个元素
            return;
        }
        int ret = partation(arr,l,r)[0];
        int ret1 = partation(arr,l,r)[1];
        quickSort(arr,l,ret); //小于value的值进行排序
        quickSort(arr,ret1,r); //大于value的值进行排序

    }
    public static int[] partation(int[] arr,int l,int r){
        int value = arr[l];
        int less = l - 1;  //小于value值分区的右边界
        int more = r + 1;  //大于value值分区的左边界
        l = l + 1;  //从arr[1]和value比较
        while(l < more){  //当l走到more前面那个位置时
            if(arr[l] < value){
                swap(arr,l++,++less);
            }else if(arr[l] == value){
                l++;
            }else{
                swap(arr,l,--more);
            }
        }
        return new int[]{less,more};
    }
    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
