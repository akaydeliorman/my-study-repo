import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        int n,u;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alıncak sayı:");
        n = input.nextInt();
        System.out.print("Üs alınacak sayı:");
        u = input.nextInt();

        int i = 1;
        while (i <= u){
            total *= n;
            i++;
        }
        System.out.print("Sonuç : "+ total);

    }
}
