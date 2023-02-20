import java.util.ArrayList;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();

        double average=0;

        for (int i = 0; i < 20; i++) {
            arr.add(random.nextInt(20));
        }
        int min=arr.get(0);
        int max=arr.get(0);
        System.out.println(arr.toString());

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)<min){
                min=arr.get(i);
            }
            if(arr.get(i)>max){
                max=arr.get(i);
            }
            average+=arr.get(i);
        }
        average=average/arr.size();

        System.out.printf("Минимальное: %d, максимальное %d, среднее арифметическое %2.3f", min, max, average);
    }
}
