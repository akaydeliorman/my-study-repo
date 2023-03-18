import java.util.Scanner;

public class ATMOdev {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0){
            System.out.print("Kullanıcı adını giriniz:");
            userName = input.nextLine();
            System.out.print("Kullanıcı adını giriniz:");
            password = input.nextLine();

            if (userName.equals("akay") && password.equals("a123")){
                System.out.println("Hoşgeldiniz.");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış");
                    System.out.print("İşlem seçiniz:");
                    select =input.nextInt();
                    if(select == 1){
                        System.out.println("Para miktarı: ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.println("Para miktarı: ");
                        int price = input.nextInt();
                        if (price > balance){
                            System.out.println("Yetersiz bakiye");
                        }else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz :" + balance);
                    }
                }while (select != 4);
                System.out.println("Tekrar bekleriz.");
                break;
            }else {
                right--;
                System.out.println("Hatalı giriş.");
                if (right == 0){
                    System.out.println("Hasap bloke edildi.");
                }else {
                    System.out.println("Kalan hakkınız : "+ right);
                }
            }
        }
    }
}
