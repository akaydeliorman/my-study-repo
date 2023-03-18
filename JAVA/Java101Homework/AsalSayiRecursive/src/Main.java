import java.util.Scanner;

public class Main {
    static String isPrime(int number){
        int num = number - 1;
        if (num == 1){
            return "Asal sayıdır.";
        } else if (number % num == 0) {
            return "Asal sayı değildir.";
        }else {
            return isPrime(number, num-1);
        }
    }
    static String isPrime(int number, int num){
        if (num == 1){
            return "Asal sayıdır.";
        } else if (number % num == 0) {
            return "Asal sayı değildir.";
        }else {
            return isPrime(number, num-1);
        }
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        System.out.println(isPrime(number));

    }
}