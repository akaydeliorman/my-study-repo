import java.util.Scanner;


public class Main {
    public static int recursive(int number, int pow){
        if (pow < 1){
            return 1;
        }
        return number * recursive(number,pow-1);
    }
    public static void main(String[] args) {
        int number, pow;
        Scanner input = new Scanner(System.in);

        System.out.print("Taban sayısını giriniz: ");
        number = input.nextInt();
        System.out.print("Taban sayısına üs giriniz: ");
        pow = input.nextInt();

        System.out.print("Sonuç: " + recursive(number,pow));


    }
}