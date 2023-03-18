import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Hnum, number , max = 0, min = 100;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç sayı girilecek: ");
        Hnum = input.nextInt();

        for (int i = 0; i < Hnum; i++){
            System.out.print("Sayı giriniz: ");
            number = input.nextInt();

            if (number > max){
                max = number;
            }else{
                min = number;
            }
        }
        System.out.print("Büyük sayi: " + max);
        System.out.print("\nKüçük sayi: " + min);
    }
}