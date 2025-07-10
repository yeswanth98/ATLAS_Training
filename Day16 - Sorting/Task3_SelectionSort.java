
class Task3_SelectionSort {

    public void SelectionSort (int arr[], int n) {
        int temp;
        for(int i=n-1; i>=1; i--) {
            int maxindex = i;
            for(int j=0;j<=i;j++) {
                if (arr[j] >= arr[maxindex])
                    maxindex = j;
            }
            temp = arr[i];
            arr[i] = arr[maxindex];
            arr[maxindex] = temp;
        }
    }
    public static void main(String[] args) {
        Task3_SelectionSort obj = new Task3_SelectionSort();
        int[] arr = {2, 9, 1, 5, 6, 8, 3, 7, 4};
        int n = arr.length;
        obj.SelectionSort(arr, n);
        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}