class Task6_BubbleSort {

    public void BubbleSort (int arr[], int n) {
        int temp;
        for(int i=n-1; i>=1; i--) {
            int maxindex = i;
            for(int j=1;j<=i;j++) {
                if (arr[j-1] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Task6_BubbleSort obj1 = new Task6_BubbleSort();
        int[] arr = {2, 9, 1, 5, 6, 8, 3, 7, 4};
        int n = arr.length;
        obj1.BubbleSort(arr, n);
        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}