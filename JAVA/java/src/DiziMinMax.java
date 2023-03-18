public class DiziMinMax {
    public static void main(String[] args) {
        int [] arr = {12, -32, 85, 213, -214, 102};

        int min = arr[0];
        int max = arr[0];

        for (int i : arr){
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
