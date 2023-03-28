import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("Oyuna Hoşgeldiniz !");
        System.out.print("İsminizi giriniz: ");

        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Kadim dünyaya hoşgeldin "+ player.getName());

        System.out.println("Lütfen karakterinizi seçiniz:");
        player.selectChar();


    }
}
