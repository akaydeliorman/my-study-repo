import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int born;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum tarihinizi giriniz: ");
        born = input.nextInt();

        if(born%12 == 0){
            System.out.print("Çin Zodyağı Burcunuz: Maymun ");
        } else if (born%12 == 1){
            System.out.print("Çin Zodyağı Burcunuz: Horoz ");
        } else if (born%12 == 2) {
            System.out.print("Çin Zodyağı Burcunuz: Köpek ");
        } else if (born%12 == 3) {
            System.out.print("Çin Zodyağı Burcunuz: Domuz ");
        } else if (born%12 == 4) {
            System.out.print("Çin Zodyağı Burcunuz: Fare ");
        } else if (born%12 == 5) {
            System.out.print("Çin Zodyağı Burcunuz: Öküz ");
        } else if (born%12 == 6) {
            System.out.print("Çin Zodyağı Burcunuz: Kaplan ");
        } else if (born%12 == 7) {
            System.out.print("Çin Zodyağı Burcunuz: Tavşan ");
        } else if (born%12 == 8) {
            System.out.print("Çin Zodyağı Burcunuz: Ejderha ");
        } else if (born%12 == 9) {
            System.out.print("Çin Zodyağı Burcunuz: Yılan ");
        } else if (born%12 == 10) {
            System.out.print("Çin Zodyağı Burcunuz: At ");
        } else if (born%12 == 11) {
            System.out.print("Çin Zodyağı Burcunuz: Koyun ");
        }
    }
}