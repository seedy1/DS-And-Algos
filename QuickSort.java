class QuickSort{

    public static void quicksort(int[] arr){
        quicksort(arr, 0, arr.lelength-1);
    }

    public static void quicksort(int[] arr, int left, int right){
        if(left >= right) return;

        int pivot = arr[(left+right)/2];

        int index = partition(array, left, right, pivot);
        quicksort(arr, left, index-1);
        quicksort(arr, index, right);
    }

    public static int partition(int[] arr, int left, int right, int pivot){
        while(left <=right){
            while(arr[left] < pivot){
                left++;
            }

            while(arr[right] > pivot){
                right--;
            }

            if(left <= right){
                swap(arr, left, right);
                left++;
                right--;
            }

        }
        return left;
    }

    public static void swap(int arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
