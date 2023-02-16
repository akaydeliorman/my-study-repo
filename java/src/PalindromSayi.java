public class PalindromSayi {
    /*
    Palindrom Sayı Nedir ?

    Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

    Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....*/

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber=0,lastNumber;

        while (temp != 0){
            lastNumber = temp % 10;
            reverseNumber = ((reverseNumber * 10) + lastNumber);
            temp /= 10;
        }

        if (number == reverseNumber){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(101));
    }
}
