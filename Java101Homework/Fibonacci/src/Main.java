import java.util.Scanner;

public class Main {

    public static void fibonacci(int basamak){
        int sup, right = 1, left = 0;

        for (int i = 0; i <= basamak; i++){
            System.out.print(left + ", ");
            sup = right;
            right += left;
            left = sup;
        }
    }

    public static void main(String[] args) {
        int basamak;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        basamak = scanner.nextInt();

        fibonacci(basamak);

    }
}