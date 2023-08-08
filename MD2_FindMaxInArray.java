import java.util.Scanner;

public class MD2_FindMaxInArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        arr = new int[size];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Element: ");
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max in array: " + max);
    }
}
