public class DiziElemanOrt {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        double sum = 0;
        /*for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }*/
        for (double i = 1;i <= arr.length; i++){
            sum += (1/i);
        }
        double avarage = sum / arr.length;
        System.out.println(avarage);
    }
}
