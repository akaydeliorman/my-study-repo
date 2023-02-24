import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, oppo = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++){

            for (int j = i; j > 0;j--){
                System.out.print(" ");
            }

            for (int j = 0; j < (number*2)-oppo; j++){
                System.out.print("*");
            }

            oppo += 2;
            System.out.println();
        }
    }
}