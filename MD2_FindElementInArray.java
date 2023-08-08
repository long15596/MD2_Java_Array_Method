import java.util.Scanner;

public class MD2_FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"Long", "Dương", "Nam", "Hùng"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String studentsName = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(studentsName)) {
                System.out.println("vị trí học sinh " + studentsName + " là " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Không tìm thấy tên " + studentsName + " trong danh sách");
        }
    }
}
