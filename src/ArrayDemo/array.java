package ArrayDemo;

import java.util.Scanner;

public class array {

    public static void insert(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " elements to insert:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static void search(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter element to search:");
        int value = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Element found at index " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }

    public static void deleteArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter element to delete:");
        int value = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                found = true;
                // Shift elements to the left to remove the element
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0; // Set the last element to 0 after shifting
                break;
            }
        }

        if (found) {
            System.out.println("Element deleted successfully.");
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static void display(int[] arr) {
        System.out.println("\nArray:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];

        while (true) {
            System.out.println("\nArray Operations Menu:");
            System.out.println("1. Insert elements");
            System.out.println("2. Display array");
            System.out.println("3. Search element");
            System.out.println("4. Delete element");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    insert(arr);
                    break;
                case 2:
                    display(arr);
                    break;
                case 3:
                    search(arr);
                    break;
                case 4:
                    deleteArray(arr);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
