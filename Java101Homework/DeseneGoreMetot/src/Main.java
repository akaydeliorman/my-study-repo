import java.util.Scanner;

public class Main {
    /*Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

    Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
    Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.*/

    static void extraction(int num){

        System.out.print(num + " ");

        if(num <= 0){
            return;
        }else {
            extraction(num-5);
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        extraction(number);
    }
}