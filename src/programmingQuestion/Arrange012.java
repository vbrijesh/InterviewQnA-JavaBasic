/**
 * Arr = [1,0,0,1,0,2,2,1,0,1]

	Result = [0,0,0,0,1,1,1,2,2]
 * 
 */

package programmingQuestion;

public class Arrange012 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result = sortArray(new int[]{1,0,0,1,0,2,2,1,0,1});
		for(int i:result) {
			System.out.print(i);
		}

	}

	static int[] sortArray(int arr[]) {
		// length check

		int zero = 0, one = 0, two = 0, i = 0;
		for (i = 0; i < arr.length; i++) {

			if (arr[i] == 0)
				zero++;

			else if (arr[i] == 1)
				one++;

			else if (arr[i] == 2)
				two++;

		}

		i = 0;

		while (zero > 0) {
			arr[i++] = 0;
			zero--;
		}

		while (one > 0) {
			arr[i++] = 1;
			one--;
		}

		while (two > 0) {
			arr[i++] = 2;
			two--;
		}

		return arr;
	}

}
