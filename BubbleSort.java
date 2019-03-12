package www.test;
/**
 * 空间复杂度：O(1)
 * 时间复杂度：O(n^2)
 * 稳定 */
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        if(n <= 1){
            return;
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j + 1]){
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }
    }
}
