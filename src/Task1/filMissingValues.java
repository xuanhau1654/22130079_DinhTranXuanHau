package Task1;

import java.util.ArrayList;

public class filMissingValues {
	// Input: 10 11 12 13 14 16 17 19 20 
		// Output: 15 18
	private int[] array;
	public filMissingValues(int[] array) {
	this.array = array;
	}
		
		// Input: 10 11 12 -1 14 10 17 19 20
		// Output(k=3): 10 11 12 12 14 16 17 19 20
		public int[] fillMissingValues(int k, int[]inputArray) {
			int[] outputArray = new int[inputArray.length];

		    for (int i = 0; i < inputArray.length; i++) {
		        if (inputArray[i] == -1) {
		            int sum = 0;
		            int count = 0;

		            for (int j = Math.max(0, i - k); j <= Math.min(inputArray.length - 1, i + k); j++) {
		                if (inputArray[j] != -1) {
		                    sum += inputArray[j];
		                    count++;
		                }
		            }

		            outputArray[i] = count > 0 ? sum / count : 0;
		        } else {
		            outputArray[i] = inputArray[i];
		        }
		    }

		    return outputArray;
			}
}
