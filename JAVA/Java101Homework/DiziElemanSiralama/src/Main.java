import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
        // Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz: ");
        n = input.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length;i++){
            System.out.print((i + 1) + ". Elamanı: ");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);
        for (int num: arr){
            System.out.print(num + " ");
        }
    }
}