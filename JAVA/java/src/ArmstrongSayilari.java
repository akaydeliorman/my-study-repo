import java.util.Scanner;

public class ArmstrongSayilari {
    public static void main(String[] args) {
        int number, basNum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        number = input.nextInt();
        int tempNum = number;
        int basValue;
        int result = 0;
        int basPow;
        while (tempNum != 0){
            tempNum /= 10;
            basNum++;
        }

        tempNum = number;
        while (tempNum != 0){
            basValue  = tempNum % 10;
            basPow = 1;
            for (int i = 1; i <= basNum;i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNum /= 10;
        }

        if (result == number){
            System.out.println(number + " Bu bir Armstrong sayıdır. ");
        }else {
            System.out.println(number + " Bu bir Armstrong sayı değildir. ");
        }
    }
}
