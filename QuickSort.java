package www.test;

public class QuickSort {
    public static void quickSort3(int[] arr){
        if(arr == null && arr.length < 2){
            return;
        }
        int n = arr.length;
        quickSortInternal3(arr,0,n-1);
    }
    public static void quickSortInternal3(int[] arr,int l,int r){
        if(r <= l){
            return;
        }
        int lt = l;
        int rt = r + 1;
        int i = l + 1;
        while(lt <= rt){
            if(arr[i] < arr[l]){
                SortHelper.swap(arr,i,lt+1);
                lt++;
                i++;
            }else if(arr[i] > arr[l]){
                SortHelper.swap(arr,i,rt - 1);
                rt--;
            }else{
                i++;
            }
        }
        SortHelper.swap(arr,l,lt);
        SortHelper.swap(arr,l,lt);
        quickSortInternal3(arr,l,lt);
    }
    public static void quickSort(int[] arr){
        int n = arr.length;
        if(n ==0 || n == 1){
            return;
        }
        quickSortInternal(arr,0,n-1);

    }
    private static void quickSortInternal(int[] arr,int l,int r){
        if(r <= l){
            return;
        }
            int c = val(arr,l,r);
            quickSortInternal(arr,l,c - 1);
            quickSortInternal(arr,c + 1,r);
    }
    /**
     * 待排序的数组
     * l */
    private static int val(int[] arr,int l,int r){
        SortHelper.swap(arr,l,(int)(Math.random()*(r-l)+1)+l);
        int j = l;
        int i = l+1;
        for(;i <= r;i ++){
            if(arr[i] < arr[l]){
                SortHelper.swap(arr,i,j + 1);
                j++;
            }
        }
        SortHelper.swap(arr,j,l);
        return j;
    }

    public static int qQuickSortInternal(int[] arr,int l,int r){
        int i = l+1;
        int j = r;
        while(true){
            while (i <= r && arr[i] < arr[l]){
                i++;
            }
            while (j >= l + 1 && arr[j] > arr[l]){
                j--;
            }
            if(i > j){
                break;
            }
            SortHelper.swap(arr,i,j);
            i++;
            j--;
        }
        SortHelper.swap(arr,j,l);
        return j;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,7,9,2,4,6,7,8,10};
        quickSort(arr);
        SortHelper.print(arr);
    }
}
