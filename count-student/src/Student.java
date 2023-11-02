import java.util.Arrays;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("Enter size of array: ");
            size = input.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
            arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter a mark for student " +  (i + 1) + ":");
                arr[i] = input.nextInt();
            }
            int count = 0;
            System.out.println("List of mark");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
                if(arr[i] >= 5 && arr[i] <= 10) {
                    count++;
                }
            }
            System.out.println("The number of student passion the exam is: " + count);
        } while (size > 30);
    }
}
