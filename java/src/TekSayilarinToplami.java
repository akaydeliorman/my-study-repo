import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        int odn;
        int total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz:");
            odn = input.nextInt();
            if(odn % 2 == 1){
                total += odn;
            }
        }while (odn > 0);
        System.out.print("Toplamları : "+ total);
    }
}
