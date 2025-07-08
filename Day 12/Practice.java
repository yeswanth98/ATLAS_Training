import java.util.Scanner;

class Counter {

	public int count(int number, int[] arr) {

		int occurence = 0;

		for (int i = 0; i<arr.length; i++) {

			if(number == arr[i]){
				occurence += 1;
			}
		}
		return occurence;
	}
}

class Practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] arr = new int[5];
		for (int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		Counter counter = new Counter();
		int result = counter.count(number,arr);
		System.out.println("The " + number +" occurs " + result + " times");
		sc.close();
	}
}