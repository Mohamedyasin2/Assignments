package class_assignments;

import java.util.Scanner;

public class DuplicateInArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of an array: ");
        int arrLength = scan.nextInt();

        int[] arr = new int[arrLength];
        System.out.println("Enter array elements:");

        for (int i = 0; i < arrLength; i++) {
            arr[i] = scan.nextInt();
        }

        boolean hasDuplicates = false;

        System.out.print("Duplicates: ");

        // Outer loop to identify duplicates
        for (int i = 0; i < arrLength; i++) {
            boolean isDuplicate = false;

            // Check if the current element has a duplicate in the previous elements
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Print the duplicate only if it's found for the first time
            if (isDuplicate) {
                // Ensure it's the first occurrence of the duplicate
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (arr[k] == arr[i]) {
                        alreadyPrinted = true;
                        break;
                    }
                }

                if (!alreadyPrinted) {
                    if (hasDuplicates) {
                        System.out.print(", ");
                    }
                    System.out.print(arr[i]);
                    hasDuplicates = true;
                }
            }
        }

        if (!hasDuplicates) {
            System.out.print("None");
        }

        scan.close();
    }
}
