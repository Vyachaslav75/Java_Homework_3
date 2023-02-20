import java.util.ArrayList;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            arr.add(random.nextInt(20));
        }
        System.out.println(arr.toString());

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)%2==0){
                arr.remove(i);
                i--;
            }
        }

        System.out.println(arr.toString());
    }
}
