class fibonacciSeries {
    public static int fibonacci (int n) {
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fibonacci(n - 1) + fibonacci(n - 2);   
    }

    // Driver Code
    public static void main(String args[])
    {
        // Given Number N
        int N = 5;

        // Print the first N numbers
        for (int i = 0; i < N; i++) {

            System.out.print(fibonacci(i) + " ");
        }
    }
}