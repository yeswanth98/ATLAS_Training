class Task9_InsertionSort {
    public static void main(String[] args) {
        Task9_InsertionSort insert = new Task9_InsertionSort();
        int[] arr = {2, 9, 1, 5, 6, 8, 3, 7, 4};
        int n = arr.length;
        insert.InsertionSort(arr, n);
        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public void InsertionSort (int arr[], int n) {
        for (int i=1;i<n;i++) {
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}