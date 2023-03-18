import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (frequency.containsKey(element)) { // containsKey() Oluşturulan HashMap'te daha önce kullanılmış olan anahtarı kontrol etmek için kullanılan metoddur.
                int availableFrequency = frequency.get(element);
                frequency.put(element, availableFrequency + 1);
            } else {
                frequency.put(element, 1);
            }
        }

        System.out.println("Dizi elemanlarının frekansları:");
        for (int eleman : frequency.keySet()) {
            int frekans = frequency.get(eleman);
            System.out.println(eleman + ": " + frekans + " sefer tekrar etmiştir.");
        }
    }
}