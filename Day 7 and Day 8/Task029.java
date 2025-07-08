public class Task029 {
    public static void main(String[] args) {
        int intArray[] = {1, 2, 3};
        int cloneArray[] = intArray.clone();
        // will print false as shallow copy is created
        System.out.println(intArray == cloneArray);
        intArray[0] = 4;
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
            System.out.println(intArray[i] + " ");
        }
    }
}