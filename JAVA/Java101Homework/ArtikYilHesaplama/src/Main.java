import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        year = input.nextInt();


        if (year %100 == 0){
            if (year %400 == 0){
                System.out.print("Bu bir artık yıldır.");
            }else {
                System.out.print("Bu bir artık yıl değildir.");
            }
        } else {
            if (year %4 == 0){
                System.out.print("Bu bir artık yıldır.");
            }else {
                System.out.print("Bu bir artık yıl değildir.");
            }
        }
    }
}