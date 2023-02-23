import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, val = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++){
            if (number % i == 0){
                val += i;
            }
        }

        if (val == number){
            System.out.print(number + " Mükemmel sayidir.");
        }else {
            System.out.print(number + " Mükemmel sayi değildir.");
        }
    }
}