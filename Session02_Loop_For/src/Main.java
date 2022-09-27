public class Main {
    public static void main(String[] args) {
        //In ra cac so tu 0 den 100
        for (int i = 0;i<=100;i++){
            for (int j = 0; j < 10; j++) {
                if (j == 2) {
                    break;
                }
            }
            System.out.printf("%d\t",i);
        }
    }
}