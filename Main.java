package question1;
import java.util.Scanner;
import java.io.*;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int searchNumber = scanner.nextInt();

        int count = 0;
        for (int number : numbers) {
            if (number == searchNumber) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The number " +searchNumber +" appears" + count +"times in the array.");
        } else {
            System.out.println("The number " +searchNumber +" is not present in the array.");
        }

        scanner.close();
    }
}
