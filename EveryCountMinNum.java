package com.tech.day;

import java.util.Scanner;

public class EveryCountMinNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int temp = 0;
            for(int i = 0;i < 10;i++){
                arr[i] = in.nextInt();
            }
            for(int i = 1;i < 10;i++){
                if(arr[i] != 0){
                    temp = i;
                    System.out.print(i);
                    break;
                }
            }
            for(int i = 0;i < arr[0];i++){
                System.out.print(0);;
            }
            for(int i = temp;i < 10;i++){
                    if(i == temp){
                        for(int j = 1;j < arr[i];j++){
                            System.out.print(i);
                        }
                    }else{
                        for(int k = 0;k < arr[i];k++){
                            System.out.print(i);
                        }
                    }
            }
    }
}

//public class EveryCountMinNum {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int[] arr = new int[10];
//        int temp = 0;
//        for(int i = 0;i < 10;i++){
//            arr[i] = in.nextInt();
//        }
//        for(int i = 1;i < 10;i++){
//            if(arr[i] != 0){
//                temp = i;
//                System.out.print(i);
//                arr[i]--;
//                break;
//            }
//        }
//        for(int i = 0;i < arr[0];i++){
//            System.out.print(0);;
//        }
//        for(int i = temp;i < 10;i++){
//                for(int k = 0;k < arr[i];k++){
//                    System.out.print(i);
//                }
//        }
//    }
//}
//2 2 0 0 0 3 0 0 1 0