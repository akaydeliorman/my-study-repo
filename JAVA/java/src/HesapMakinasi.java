import java.util.Scanner;
public class HesapMakinasi {
    public static void main(String[] args) {
        int num1, num2, chosse;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk degeri giriniz: ");
        num1 = input.nextInt();
        System.out.print("İkinci degeri giriniz: ");
        num2 = input.nextInt();

        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.print("Yapmak istediğiniz işlem :");
        chosse = input.nextInt();

        switch (chosse){
            case 1:
                System.out.println("Toplam :"+ (num1 + num2));
                break;
            case 2:
                System.out.println("Toplam :"+ (num1 - num2));
                break;
            case 3:
                System.out.println("Toplam :"+ (num1 * num2));
                break;
            case 4:
                System.out.println("Toplam :"+ (num1 / num2));
                break;
            default:
                System.out.println("İşlem yapılamaz.");
        }
    }
}
