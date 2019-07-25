package com.tech.day.day1;

import java.util.Arrays;

public class MyMergeSort {
    public static void main(String[] args) {
        int[] arr = {3,2,11,1,2,8,10,20,19,20,4,1,9,8,6,7,7};
        int[] tmp = new int[arr.length];//临时数组，用来将合并的元素拷贝到arr
        mergeSort(arr,0,arr.length - 1,tmp);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int l,int r,int[] tmp){
        if(l < r){//分到一个元素
            int mid = (l+r)/2;//找到分界点
            mergeSort(arr,l,mid,tmp);//左边继续分思想
            mergeSort(arr,mid + 1,r,tmp);//右边继续进行分思想
            merger(arr,l,mid,r,tmp);//当分到只剩一个元素时进行合并
        }



    }
    public static void merger(int[] arr,int left,int mid,int right,int[] tmp){
        int i = left;
        int j = mid + 1;
        int t = 0;
        while(i <= mid && j <= right){//左右分区都有元素
            if(arr[i] <= arr[j]){
                tmp[t++] = arr[i++];
            }else{
                tmp[t++] = arr[j++];
            }
        }
        while(i <= mid){//右分区没有元素，左分区还有元素
            tmp[t++] = arr[i++];
        }
        while(j <= right){//左分区没有元素，右分区还有元素
            tmp[t++] = arr[j++];
        }
        t = 0;
        while(left <= right){//从临时数组中拷贝元素到arr
            arr[left++] = tmp[t++];
        }
    }
}
