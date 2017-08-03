package labexcercise;

import java.util.Arrays;


public class NthLowest {

    public NthLowest() {
        // TODO Auto-generated constructor stub
    }

    private boolean validateInput(int[] arr, int nth) {
        if (nth > 0 && nth < arr.length) {
            return true;
        }
        return false;
    }

    public int getNthLowest(int[] arr, int nth) {
        if (validateInput(arr, nth)) {
            Arrays.sort(arr);
            return arr[nth - 1];
        }
        return 0;
    }

}
