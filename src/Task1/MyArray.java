package Task1;

public class MyArray {
	private int[] arr;

	public MyArray(int[] array) {
		this.arr = array;
	}

	 public void mirror() {
	        int length = arr.length;
	        int[] mirroredArr = new int[length * 2];

	        for (int i = 0; i < length; i++) {
	            mirroredArr[i] = arr[i];
	            mirroredArr[length * 2 - i - 1] = arr[i];
	        }

	        // Update the array reference to the mirrored array
	        arr = mirroredArr;
	}

	public void print() {

		for (int i = 0; i < arr.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}

	}

	public static void main(String[] args) {
		int[] original = { 1, 2, 3 };
		MyArray myArray = new MyArray(original);

		System.out.print("");
		myArray.print();

		myArray.mirror();
		System.out.print(", ");
		System.out.print("");
		myArray.print();
	}
	
	
}
	

