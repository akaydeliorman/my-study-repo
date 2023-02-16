import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double taksKm = 2.20, opfee = 10, total;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Km'yi giriniz : ");
        km = girdi.nextInt();

        total = (km * taksKm);
        total += opfee;

        total = (total < 20) ? 20 : total;
        System.out.println("Ucret :" + total);
    }
}
