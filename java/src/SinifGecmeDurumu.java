import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {
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

        double ort = (mat + fz + tr + kim + mz + th) / 5 ;
        if(ort <= 55){
            System.out.println("Kaldın");
            System.out.println("Ortalama :"+ ort);
        }else {
            System.out.println("Geçtin");
            System.out.println("Ortalama"+ ort);
        }
    }
}
