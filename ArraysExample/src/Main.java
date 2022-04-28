import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    private static int[] getIntegers(int arrayCapacity) {
        int[] intArray = new int[arrayCapacity];
        System.out.println("Enter " +arrayCapacity+ " integer values: \r");
        for (int i = 0; i < intArray.length; ++i)
            intArray[i] = scanner.nextInt();
        return intArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i)
            System.out.println("Element at index " +i+ " is: " +array[i]);
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < sortedArray.length; ++i)
            sortedArray[i] = array[i];
        boolean semaphore = true;
        int temp;
        while(semaphore) {
            semaphore = false;
            for (int i = 0; i < (sortedArray.length -1); ++i)
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    semaphore = true;
                }
        }
        return sortedArray;
    }


}