public class MD2_FindMinElement {
    public static void main(String[] args) {
        int[] arr = {9, 8 ,7 ,6, 5, 4};
        int index = minElement(arr);
        System.out.println("Min element: " + arr[index]);
    }
    public static int minElement(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
