package Task1;

public class MyArray_b {
	public static int[] removeDuplicates(int[] arr, int currentIndex) {
		if(currentIndex == arr.length-1) {
			return new int[] {arr[currentIndex]};
		}
		int[] subArr = removeDuplicates(arr, currentIndex+1);
			boolean isDuplicates = false;
			for (int element : subArr) {
				if(element == arr[currentIndex]) {
					isDuplicates = true;
					break;
			}
		}
		if(isDuplicates) {
			return subArr;
		}else {
			int [] newArr = new int[subArr.length+1];
			System.arraycopy(subArr, 0, newArr, 0, subArr.length);
			newArr[subArr.length] = arr[currentIndex];
			return newArr;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,3,5,1,3,7,9,8};
		int currentIndex=0;
		int[] resultArr = removeDuplicates(arr, currentIndex);
		for (int element : resultArr) {
            System.out.print(element + " ");
        }
	}
}
