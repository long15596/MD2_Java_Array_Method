import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      int[] arr1 = {1, 2, 3, 5, 4};
      int[] arr2 = {5, 6, 7, 8 , 9};
      int[] newArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, newArr, 0, arr1.length);
        System.arraycopy(arr2,0, newArr, arr1.length, arr2.length);
        System.out.println(Arrays.toString(newArr));
    }
}