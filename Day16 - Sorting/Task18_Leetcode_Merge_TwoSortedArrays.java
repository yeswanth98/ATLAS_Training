public class Task18_Leetcode_Merge_TwoSortedArrays {

    // Method to merge two sorted arrays
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Traverse both arrays
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int val : arr)
            System.out.print(val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};

        System.out.print("Array 1: ");
        printArray(arr1);

        System.out.print("Array 2: ");
        printArray(arr2);

        int[] merged = mergeSortedArrays(arr1, arr2);

        System.out.print("Merged Sorted Array: ");
        printArray(merged);
    }
}
