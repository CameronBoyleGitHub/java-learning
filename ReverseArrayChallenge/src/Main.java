import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 7, 11, 9, 15};

        // The correct way to print the array elements:
        System.out.println("Array elements are: " + Arrays.toString(array));

        reverseArray(array);
        System.out.println("Reversed elements are: " + Arrays.toString(array));

    }

    private static void reverseArray(int[] array) {
        int maxIndex = array.length - 1;
        int median = array.length / 2;
        for (int i = 0; i < median; ++i) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;

        }
    }
}