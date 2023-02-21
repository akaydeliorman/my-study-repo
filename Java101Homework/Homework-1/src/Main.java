import java.util.Scanner;

public class Main {

    /*Kilo (kg) / Boy(m) * Boy(m)
    Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
    Lütfen kilonuzu giriniz : 105
    Vücut Kitle İndeksiniz : 35.49215792320173*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz:");
        double height = input.nextDouble();
        System.out.print("Lütfen ağırlığınızı giriniz:");
        double weight = input.nextDouble();

        double vki = (weight/(height*height));
        System.out.print("Vücut kitle indeksiniz: "+ vki);

    }
}