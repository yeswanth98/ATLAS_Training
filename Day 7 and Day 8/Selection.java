public class Selection {
    // Main method
    public static void main(String[] args) {
        int[] arr = {5,3,8,4,2};
        System.out.print("Before Sorting:");
        printArray(arr);
        selectionSort(arr);
        System.out.print("After Sorting:");
        printArray(arr);
    }
    // sorting algorithm
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            int minindex = i;
            // find the index of smallest element in the array
            for (int j=i+1; j<n; j++){
                if (arr[j]<arr[minindex])
                    minindex = j;
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int[] arr){
        for (int num : arr){
            System.out.print(num+" ");
        }
    }
}
