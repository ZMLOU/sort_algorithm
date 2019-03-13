package www.test;
/**
 *空间复杂度 O(1)
 * 时间复杂度：
 * 最好情况 O(n)
 * 最坏情况：O(n^2)
 * 稳定*/
public class BinaryInsertSort {
    public static void binaryInsertSort(int[] arr){
        int n = arr.length;
        if(n <= 1){
            return;
        }else{
            for(int i = 1;i < n;i++){  //无序序列的第一个元素
                int l = 0;
                int h = i-1;  //有序序列的最后一个元素
                int j = i-1;   //有序序列的最后一个元素
                int val = arr[i];
                if(val < arr[j]){
                    while(l <= h){
                        int mid = (l + h)/2;
                        if(val > arr[mid]){
                            l = mid+1;
                        }else {
                            h = mid-1;
                        }
                    }
                    for(;j >= h+1;j--){   //将有序序列中的元素从后往前依次移动一位
                        arr[j+1] = arr[j];
                    }
                    arr[j+1] = val;
                }
            }
        }
    }

}
