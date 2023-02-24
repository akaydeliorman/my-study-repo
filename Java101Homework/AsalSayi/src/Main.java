import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numbers = 0;

        for (int n=1; n<100;n++) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    numbers++;
                }
            }
            if (numbers == 1) {
                System.out.print(n+" ");
            }
            numbers=0;
        }
    }
}