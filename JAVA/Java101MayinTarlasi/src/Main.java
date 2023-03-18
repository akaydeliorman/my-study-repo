import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Satır Giriniz: ");
        int row = input.nextInt();
        System.out.println("Satır Giriniz: ");
        int col = input.nextInt();
        MineSweeper mineSwee = new MineSweeper(row,col);
        mineSwee.run();
    }
}