import java.util.Arrays;
public class DiziTekrarEdenBulma {
    static boolean isFind(int[] arr,int value){
        for (int i: arr) {
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arrList = {7,5,2,7,5,21,78,5,2,17,8,52,78,512};
        int[] duplicate = new int[arrList.length];
        int startIndex = 0;
        for (int i = 0; i < arrList.length;i++){
            for (int j = 0; j < arrList.length;j++){
                if((i != j) && (arrList[i] == arrList [j])){
                    if(!isFind(duplicate,arrList[i])){
                        duplicate[startIndex++] = arrList[i];
                    }
                    break;
                }

            }
        }
        for(int value : duplicate){
            if (value != 0){
                System.out.print(value + ", ");
            }
        }
//        System.out.println(Arrays.toString(duplicate));
    }
}
