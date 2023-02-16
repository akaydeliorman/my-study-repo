import java.util.Scanner;
public class DikUcgen {
    public static void main(String[] args) {
        int a , b;
        double c;

        Scanner girdi = new Scanner(System.in);
        System.out.print(" Hipotenüs hesaplaması için değeri giriniz : ");
        a = girdi.nextInt();
        System.out.print(" Hipotenüs hesaplaması için değeri giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipo : " +c);
    }
}
