/*
 * [4, 3, 3, 1]`, 3 is present twice and 2 is missing, so 3 + 2 = `5` should be returned
 * 7,5,2,4,1,5,6 > 8
 */

package programmingQuestion;

public class FindSumOfMissingAndRepeatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,5,2,4,1,5,6};
        missingNumber(arr);
	}
	
	public static void missingNumber(int[] arr){
        int size = arr.length;
        int sum=0;
        int i;
        for(i=0; i<size; i++){
            int val = Math.abs(arr[i]);
            if(arr[val-1]>0)
                arr[val-1]=-arr[val-1];
            else {
                // System.out.println(val);
                sum = val;
            }
        }
        // System.out.println("out"+sum);
        
        for(i=0; i<size; i++){
            if(arr[i]>0) {
                System.out.println(sum+i+1);                
            }
                // sum = sum+i+1;
                //System.out.println(sum);
        }
    }

}
