import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        n = input.nextInt();

        double resutl = 0.0;

        for (double i = 1;i <= n; i++){
            resutl += (1/i);
        }
        System.out.print(resutl);
    }
}
