import java.util.Scanner;
public class KullaniciGiris {
    public static void main(String[] args) {
        String userName, pass;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adı :");
        userName = input.nextLine();

        System.out.print("Şifre :");
        pass = input.nextLine();

        if(userName.equals("akay") && pass.equals("a123")){
            System.out.println("Giriş başarılı");
        }else {
            System.out.println("Bilgiler yanlış");
        }
        /*
            Ödev
            Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
            unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
            sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
        */
    }
}
