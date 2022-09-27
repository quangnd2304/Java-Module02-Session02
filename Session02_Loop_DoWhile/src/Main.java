import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * In ra menu cho phep order do an sang cho sinh vien
        * **************MENU*****************
        * 1. Pho bo kobe
        * 2. Pho ga doi
        * 3. Xoi ga
        * 4. Banh my pate
        * 5. My tom khong nguoi lai
        * 6. Thoat
        * */
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("*****************MENU******************");
            System.out.println("1. Pho bo kobe");
            System.out.println("2. Pho ga doi");
            System.out.println("3. Xoi ga");
            System.out.println("4. Banh my pate");
            System.out.println("5. My tom khong nguoi lai");
            System.out.println("6. Thoat");
            System.out.print("Su lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Cam on ban da chon pho bo kobe");
                    break;
                case 2:
                    System.out.println("Cam on ban da chon pho ga doi");
                    break;
                case 3:
                    System.out.println("Cam on ban da chon xoi ga");
                    break;
                case 4:
                    System.out.println("Cam on ban da chon banh my pate");
                    break;
                case 5:
                    System.out.println("Ban da het tien roi sao, cam on da chon my tom khong nguoi lai");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Xin vui long chon tu 1-6");
            }
        }while (true);
    }
}