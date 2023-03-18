import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

class MineSweeper {
    Scanner input = new Scanner(System.in); // Satır ve sütün sayılarını alıcaz
    Random rand = new Random(); // Random mayın üretmek için kullanıcaz
    String[][] mineSwee; // Çok boyutlu dizimiz.
    int mines[]; // Mayınlar.
    int rowN, colN; // Satır ve sütün değişkenleri
    boolean isWin = false; // Kazanma durumunda geçerli olana true false koşulu.

    MineSweeper(int rowN, int colN){
        this.rowN = rowN;
        this.colN = colN;
        this.mineSwee = new String[rowN][colN];
        this.mines = new int[(rowN*colN)/4];

        // Map
        for (int i = 0; i < rowN;i++){
            for (int j = 0; j < colN; j++){
                mineSwee[i][j] = " - ";
            }
        }

        // Mayın = (rowN * colN) / 4 birbirinden farklı random sayı üretilecek Liste oluştur ve bunları liste içine at.
        for (int i = 0; i < (rowN*colN)/4;){
            int randomMine = rand.nextInt((rowN*colN));
            if (!(Arrays.stream(mines).anyMatch(x -> x == randomMine))){
                mines[i] = randomMine;
                i++;
                System.out.println("Mayın: "+ randomMine);
            }
        }

    }
    // While döngüsü satır ve sütün sorgula.
    public void boardmap(String[][] mineL){
        for(String mineR[] : mineSwee){
            for (int i = 0; i < mineR.length; i++){
                System.out.print(mineR[i]);
            }
            System.out.println();
        }
    }

    // Control Point
    public int mineControl(int row, int col){
        if((Arrays.stream(mines).anyMatch(x -> x == (row-1)*this.colN+col))){
            return -1;
        }else {
            int output = 0;
            if (Arrays.stream(mines).anyMatch(x -> x == (row-1)*this.colN+(col - 1))){
                output += 1;
            }if (Arrays.stream(mines).anyMatch(x -> x == (row-1)*this.colN+(col + 1))) {
                output += 1;
            }if (Arrays.stream(mines).anyMatch(x -> x == (row-2)*this.colN+col)){
                output += 1;
            }if(Arrays.stream(mines).anyMatch(x -> x == (row)*this.colN+col)){
                output += 1;
            }if(Arrays.stream(mines).anyMatch(x -> x == (row-2)*this.colN+(col-1))){
                output += 1;
            }if(Arrays.stream(mines).anyMatch(x -> x == (row-2)*this.colN+(col+1))){
                output += 1;
            }if (Arrays.stream(mines).anyMatch(x -> x == (row)*this.colN+(col+1))){
                output += 1;
            }if (Arrays.stream(mines).anyMatch(x -> x == (row)*this.colN+(col-1))){
                output += 1;
            }
            return output;
        }
    }

    // Start
    public void run(){
        boardmap(mineSwee);
        int sRow,sCol;
        int sayac = 0;
        // 5*3/4 KADAR RANDOM SAYI
        // Kullanıcının oyuna başladığında seçtiği sıralar ve sütunlar yerler.
        while (!isWin){
            System.out.print("Satır giriniz: ");
            sRow = input.nextInt();
            System.out.print("Sütun giriniz: ");
            sCol = input.nextInt();
            System.out.println("=================");
            mineControl(sRow,sCol);
            if (mineControl(sRow,sCol) == -1){
                System.out.println("GAME OVER !!");
                break;
            }else {
                sayac += 1;
                mineSwee[sRow-1][sCol-1] = String.valueOf(" "+ mineControl(sRow,sCol) + " ");
                boardmap(mineSwee);
                if (sayac == rowN*colN - (rowN*colN)/4){
                    System.out.println("WIN !!");
                    break;
                }
            }
        }
    }
}
