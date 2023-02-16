import java.util.Random;
import java.util.Scanner;

class MineSweeper {
    Scanner input = new Scanner(System.in); // Satır ve sütün sayılarını alıcaz
    Random rand = new Random(); // Random mayın üretmek için kullanıcaz
    int[][] mineSwee; // Çok boyutlu dizimiz.
    int mines; // Mayınlar.
    int rowN, colN; // Satır ve sütün değişkenleri
    boolean isWin = false; // Kazanma durumunda geçerli olana true false koşulu.

    MineSweeper(int rowN, int colN){
        this.rowN = rowN;
        this.colN = colN;
        this.mineSwee = new int[rowN][colN];


    }

    /*public void boardmap(int[][] arr){
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                if (ints[j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }*/
    public void boardmap(int [][] mineL){
        for(int i = 0; i < mineL.length;i++){
            for(int j = 0; j < mineL.length;j++){
                if (i > j){

                }
            }
            System.out.println();
        }
    }

    public void run(){
        boardmap(mineSwee);
        int sRow,sCol;

        // Kullanıcının oyuna başladığında seçtiği sıralar ve sütunlar yerler.

        System.out.print("Satır giriniz: ");
        sRow = input.nextInt();
        System.out.print("Sütun giriniz: ");
        sCol = input.nextInt();
        System.out.println("=================");

    }

}
