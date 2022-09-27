import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //In ra cau xin chao cac ban lop Java-08 cho den khi nao nhap phim 1
        int a = 0;
        Scanner sc = new Scanner(System.in);
        while(a!=1){
            System.out.println("Xin chao cac ban lop Java-08");
            System.out.println("Nhap vao 1 so:");
            a = sc.nextInt();
        }
    }
}