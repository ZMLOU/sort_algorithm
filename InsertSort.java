package www.test;
/**
 * 空间复杂度：O(1)
 * 时间复杂度：
 * 最好情况：O(n)
 * 最坏情况：O(n^2)
 * 稳定*/
//  将一个数组分成两部分，前面一部分有序，后面一部分无序
public class InsertSort {
    public static void insertSort(int[] arr){
        int n = arr.length;
        if(n <= 1){
            return ;
        }else{
            for(int i = 1;i < n;i++){  // i 是无序数组中第一个元素的下标
                int j = i-1;    // j 是有序数组中最后一个元素的下标
                int val = arr[i];
                for(;j >= 0;j--){
                    if(arr[j] > val){
                        arr[j+1]=arr[j];  // 将比val大的都往后挪一位
                    }else{
                        break;
                    }
                }
                arr[j+1]=val;  //将val插入找到的位置
            }
        }
    }
}
