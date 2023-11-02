import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 ,4, 5};
        // Khai báo mảng: Kiểu dữ liệu [] Tên mảng = { phần tử bên trong, cách nhau bằng dấu phấy }
        int[] arr1 = new int[5];
        // Khai báo mảng với độ dài chỉ định: Kiểu dữ liệu [] Tên mảng = new Kiểu dữ liệu [độ dài của maảng]
        // Trong Java khi khởi tạo một mảng sẽ không thay đổi được chỉ số của mảng

        // dùng vòng lặp để duyệt phần tử trong mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Dùng vòng lặp fori: " + arr[i]);
        }
        for (int num: arr) {
            System.out.println("Dùng vòng lắp foreach: " + num);
        }

        //Truy xuất 1 phần tử: tên mảng [vị trí phần tử trong mảng]
        System.out.println("Phần tử vị trí 1: " + arr[1]);

        // Thêm phần tử vào mảng: tên mảng [vị trí phần tử muốn thêm] = giá trị muốn thêm
        arr1[0] = 9;
        arr1[1] = 8;
        arr1[2] = 7;
        arr1[3] = 6;
        arr1[4] = 5;

        System.out.println("Mảng sau khi thêm: " + Arrays.toString(arr1)); // Arrays.toString để chuyển thành chuỗi ký tự

        // Sửa phần tử trong mảng: tên mảng [vị trí phần tử muốn sửa] = giá trị muốn sửa

        arr1[2] = 10;

        System.out.println("Mảng sau sửa: " + Arrays.toString(arr1));

        // Xóa phần tử trong mảng theo vị trí muốn xóa: tạo 1 mảng mới có chỉ số nhỏ hơn mảng ban đầu, dùng vòng lặp để thêm những phần tử không muốn xóa vào mảng mới

        int[] newArr = new int[arr1.length - 1];
        int index = 1; // vị trí phần tử muốn xóa
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (i != index) {
              newArr[j] = arr1[i];
              j++;
            }
        }

        System.out.println("Mảng trước khi xáo " + Arrays.toString(arr1));
        System.out.println("Mảng sau khi xóa " + Arrays.toString(newArr));

        // Xáo phần tử theo giá trị: tạo 1 mảng mới và đẩy các phần tử không muốn xóa

        int[] newArr1 = new int[arr1.length - 1];
        int deleteNum = 10;
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != deleteNum) {
                newArr1[k] = arr1[i];
                k++;
            }
        }
        System.out.println("Mảng trước khi xáo: " + Arrays.toString(arr1));
        System.out.println("Mảng sau khi xóa: " + Arrays.toString(newArr1));
    }
}
