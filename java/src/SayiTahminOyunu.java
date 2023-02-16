import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        int i = 0;
        boolean isWin = false;
        boolean isWrong = false;
        System.out.println(number);
        while (right < 5){
            System.out.println("Tahmin giriniz.");
            selected = input.nextInt();
            if (selected < 0 || selected > 99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong){
                    System.out.println("Çok fazla hatalı giriş. Kalan hak: " + (5 - (++right)) );
                }else {
                    isWrong = true;
                    System.out.println("Uyarı. Bir sonraki hatalı giriş hakkınızdan kullanılacaktır.");
                }
                continue;
            }
            if (selected == number){
                System.out.println("Tahmin edilen sayı doğru : "+ number);
                isWin = true;
                break;
            }else{
                System.out.println("Hatalı bir sayı girdiniz! ");
                if (selected > number){
                    System.out.println(selected + " istenilenden büyüktür.");
                }else {
                    System.out.println(selected + " istenilenden küçüktür.");
                }

                wrong[right] = selected;
                right++;

                System.out.println("Kalan hakkı : " + (5 - right));
            }
        }
        if (!isWin){
            System.out.println("Başaramadınız.");
            if (!isWrong){
                System.out.println("Tahminler tükendi. Yapılan Tahminler " + Arrays.toString(wrong));
            }
        }
    }
}
