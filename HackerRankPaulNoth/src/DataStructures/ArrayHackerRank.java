package DataStructures;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class ArrayHackerRank {

	// Complete the reverseArray function below.
	static int[] reverseArray(int[] a) {

		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}
		
		return a;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int arrCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[arrCount];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < arrCount; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int[] res = reverseArray(arr);

		for (int i = 0; i < res.length; i++) {
			System.out.println(String.valueOf(res[i]));

			if (i != res.length - 1) {
				System.out.println(" ");
			}
		}

		scanner.close();
	}

}
