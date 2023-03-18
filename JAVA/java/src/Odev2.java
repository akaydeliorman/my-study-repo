import java.util.Scanner;
public class Odev2 {
    public static void main(String[] args) {
        // Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        double deger, kdvOrani = 0.18, kdvTutari, kdvlifiyat;

        Scanner input = new Scanner(System.in);
        System.out.print("Deger giriniz : ");
        deger = input.nextDouble();
        kdvTutari = deger * kdvOrani;
        kdvlifiyat = deger + kdvTutari;

        System.out.println("Girilen değer : " + deger);
        System.out.println("KDV oranı : " + kdvOrani);
        System.out.println("KDV tutarı : " + kdvTutari);
        System.out.println("KDV'li fiyatı " + kdvlifiyat);

    }
}
