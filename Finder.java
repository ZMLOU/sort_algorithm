package com.tech.day;

public class Finder {
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int quickSortInternal(int arr[],int l,int r){
//        int v = arr[l];
//        int lt = l;
//        int i = l + 1;
//        int gt = r + 1;
//        while(lt <= gt){
//            if( arr[i] > v){
//                swap(arr,i,lt);
//                i++;
//                lt++;
//            }else if(arr[i] < v){
//                swap(arr,i,gt - 1);
//                gt--;
//            }else{
//                i++;
//            }
//        }
//        swap(arr,l,lt);
//        return arr[lt];


        int temp = arr[r];
        int less = l - 1;
        int more = r + 1 ;
        while(l < more){
            if(arr[l] > temp){
                swap(arr,++less,l++);
            }else if(arr[l] == temp){
                l++;
            }else{
                swap(arr,l,--more);
            }
        }
        return less + 1;
    }
    public static int quickSort(int arr[],int l,int r,int K){
        int ret = quickSortInternal(arr,l,r);
        if(ret == K - 1){
            return arr[ret];
        }else if(ret > K - 1){
            return quickSort(arr,l,ret - 1,K);
        }else{
            return quickSort(arr,ret + 1,r,K);
        }
    }
    public static int findKth(int a[], int n, int K) {
        // write code here
        return quickSort(a,0,n - 1,K);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
        System.out.println(findKth(arr,5,5));
    }
}


//public class Finder {
//    public static void main(String[] args) {
//        int[] arr = new int[]{1,3,2,2,5};
//        Finder finder = new Finder();
//        System.out.println(finder.findKth(arr,5,4));
//    }
//    public int findKth(int[] arr, int n, int K) {
//        return findKth(arr,0,n - 1,K);
//    }
//    public int findKth(int[] arr,int l,int r,int k){
//        int ret = partition(arr, l, r);
//        if(ret == k - 1){
//            return arr[ret];
//        }else if(ret < k - 1){
//            return findKth(arr,ret + 1,r,k);
//        }else{
//            return findKth(arr,l,ret - 1,k);
//        }
//    }
//    public int partition(int[] arr,int l,int r){
//        int temp = arr[r];
//        int less = l - 1;
//        int more = r + 1 ;
//        while(l < more){
//            if(arr[l] > temp){
//                swap(arr,++less,l++);
//            }else if(arr[l] == temp){
//                l++;
//            }else{
//                swap(arr,l,--more);
//            }
//        }
//        return less+1;
//    }
//    public void swap(int[] arr,int i,int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//
//    }
//}
//
