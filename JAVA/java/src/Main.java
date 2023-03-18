import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int mat, fz, kim, tr, th, mz;

        Scanner input = new Scanner(System.in);

        System.out.print("Mat notu : ");
        mat = input.nextInt();

        System.out.print("Fiz notu : ");
        fz = input.nextInt();

        System.out.print("Kim notu : ");
        kim = input.nextInt();

        System.out.print("Tr notu : ");
        tr = input.nextInt();

        System.out.print("Tar notu : ");
        th = input.nextInt();

        System.out.print("Muz notu : ");
        mz = input.nextInt();

        int toplam = (mat + fz + kim + tr + th + mz);
        double sonuc = toplam / 6.0;
        System.out.println("ORT : "+ sonuc);


    }
}