import java.util.Scanner;

public class GirilenSay2Kuvveti {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Limiti girin:");
        n = input.nextInt();

        for (int i = 1; i < n; i *= 2){
            System.out.println(i);
        }
    }
}
