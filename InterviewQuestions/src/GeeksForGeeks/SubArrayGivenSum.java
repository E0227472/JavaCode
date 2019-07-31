package GeeksForGeeks;

import java.util.Scanner;

public class SubArrayGivenSum {

	static void subArray(int[] arr, int sum) {
		// 1st loop starts with the first value
		int startIndex = 0;
		int endIndex = 0;
		int startValue = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			 startValue = arr[i];
			// 2nd loop starts with the remaining values
			for (int j = i + 1; j < arr.length; j++) {
				if(startValue == sum) {
					startIndex = i +1;
					endIndex = i+1;
					break;
				} else if (arr[j] == sum) {
					startIndex = j +1;
					endIndex = j+1;
					break;
				}
				startValue += arr[j];
				//System.out.println("StartValue is : " + startValue);
				if (startValue == sum) {
					startIndex = i + 1;
					endIndex = j + 1;
					break;
				} else if (startValue > sum) {
					break;
				}
			}
			
			if(startIndex != 0 && endIndex != 0)
				break;
		}
		
		if(startIndex == 0 && endIndex == 0 && arr[arr.length-1] == sum) {
			System.out.println(arr.length-1);
		} else if(startIndex == 0 && endIndex == 0 && arr[arr.length-1] != sum)
			System.out.println(-1);
		else 
			System.out.println(startIndex + " " + endIndex);
	}

	public static void main(String[] args) {

		System.out.println("Enter the number of test cases: ");
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		for (int tI = 0; tI < t; tI++) {
			System.out.println("Enter the values for n and s respectively: ");

			int n = Integer.parseInt(scanner.next());
			int s = Integer.parseInt(scanner.next());

			int arr[] = new int[n];
			System.out.println("Enter the values for the array: ");
			for (int nI = 0; nI < n; nI++) {
				arr[nI] = Integer.parseInt(scanner.next());
			}

			subArray(arr, s);

		}

	}

}
