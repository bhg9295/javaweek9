package homwworkWeek9Java;

import java.util.Arrays;

// Write a Java program to reverse an array of integer values.
public class ArrayOfIntegerValues3 {
    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        reverse(array);

        for (int i = 0; i < array.length; i++) {

        }

        System.out.println("ArrayOfIntegerValue3 : " + Arrays.toString(array));
    }


}
