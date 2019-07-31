package Rakuten;

import java.util.Arrays;

public class TestExample {

	static int solution(int[] A) {
		int max = Arrays.stream(A).max().getAsInt();

		if (max < 1) // if all values are negative, then max is 1
			return 1;

		if (A.length == 1) { // situation if only 1 element exists

			if (A[0] == 1)
				return 2;
			else
				return 1;
		}
		int i = 0;
		// create copyArray with default values set to 0.
		int[] index = new int[max]; // the array values are stored as index in the copy array

		for (i = 0; i < A.length; i++) {

			if (A[i] > 0) {
				if (index[A[i] - 1] != 1) // if the value exists, store it as value 1 at index position = A[i] -1.
				{
					index[A[i] - 1] = 1;
				}
			}
		}

		// linearly loop through copy array. if the first 0 appears at index position j,
		// that is the smallest positive j value.
		for (i = 0; i < index.length; i++) {
			if (index[i] == 0) {
				return i + 1;
			}
		}
		// if all values are consequtive and exists from 1 -- max, then highest value is max +1.
		return i + 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
