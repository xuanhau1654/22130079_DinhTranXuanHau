package Task1;

import java.util.ArrayList;
import java.util.List;
public class MisingValues {
private int[] array;
public MisingValues(int[] array) {
this.array = array;
}
public int[] getMissingValues() {
	int min = array[0];
    int max = array[0];

    for (int i = 1; i < array.length; i++) {
        if (array[i] < min) {
            min = array[i];
        }
        if (array[i] > max) {
            max = array[i];
        }
    }
    
    ArrayList<Integer> missingValues = new ArrayList<>();
    
    for (int i = min; i <= max; i++) {
        if (!contains(array, i)) {
            missingValues.add(i);
        }
    }
    
    int[] result = new int[missingValues.size()];
    for (int i = 0; i < missingValues.size(); i++) {
        result[i] = missingValues.get(i);
    }
    
    return result;
	}
private boolean contains(int[] array, int value) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == value) {
            return true;
        }
    }
    return false;
}
}