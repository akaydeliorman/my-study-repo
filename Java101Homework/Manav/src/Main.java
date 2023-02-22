import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Manav Kasa Programı

        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL*/

        double armut =2.14, elma=3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut kaç kilo: ");
        armut *= input.nextDouble();
        System.out.println("Elma kaç kilo: ");
        elma *= input.nextDouble();
        System.out.println("Domates kaç kilo: ");
        domates *= input.nextDouble();
        System.out.println("Muz kaç kilo: ");
        muz *= input.nextDouble();
        System.out.println("Patlican kaç kilo: ");
        patlican *= input.nextDouble();

        toplam = armut + elma + domates + muz + patlican;
        System.out.println("Toplam fiyat: "+toplam);
    }
}