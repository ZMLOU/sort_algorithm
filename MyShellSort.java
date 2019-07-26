package com.tech.day.day1;

import java.util.Arrays;

public class MyShellSort {
    public static void main(String[] args) {
        int[] arr = {3,2,11,1,2,8,10,20,19,20,4,1,9,8,6,7,7};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void shellSort(int[] arr){
        //初始化一个增量：插入排序的增量为1（当希尔排序的增量变为1的时候即插入排序）
        int increment = arr.length / 3 + 1;
        while(increment > 0){
            for(int i = increment;i < arr.length ;i++){
                //i处的元素比i-increment处的元素小
                if(arr[i] < arr[i - increment]){
                    int j = 0;
                    int tmp = arr[i];//将i的元素保存起来，以便i-increment的后移操作
                    for(j = i - increment;j >= 0;j -= increment){//遍历，找到tmp插入的位置
                        if(arr[j] > tmp){
                            //只要比tmp大，都将其后移
                            arr[j + increment] = arr[j];
                        }else {
                            break;
                        }
                    }
                    arr[j + increment] = tmp;//将tmp插入相应的位置
                }
            }
            increment--;
        }
    }
}
