import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/

        double km,total=0,priceKm=0.10;
        int age,type;

        Scanner input = new Scanner(System.in);
        System.out.print("Biletinizdeki mesafeyi km cinsinden giriniz: ");
        km = input.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini seçinizi:\n1-Tek Yön\n2-Gidiş-Dönüş\n");
        type = input.nextInt();

        if ((km > 0) && (age > 0)){
            total = km*priceKm;
            if (age < 12){
                total -= total*0.5;
                System.out.print("12 yaş altına %50 indirim uygulandı.\n"+ total  );
            }else if (age < 24){
                total -= total*0.1;
                System.out.print("12-24 yaş arasına %10 indirim uygulandı.\n"+ total  );
            }else if (age > 65){
                total -= total*0.3;
                System.out.print("65 yaş üstüne %30 indirim uygulandı.\n"+ total  );
            }
            if (type == 2){
                total -= total*0.2;
                System.out.print("Gidiş-Dönüş bileti alındığı için %20 indirim uygulandı.\n"+ total  );
            }
        }else {
            System.out.print("Yanlış veri girildi !");
        }
    }
}