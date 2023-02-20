import java.util.ArrayList;
import java.util.Random;

public class Task_4 {
    private static ArrayList<Integer> arrayAminusB(ArrayList<Integer> A, ArrayList<Integer> B){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            if (!B.contains(A.get(i))){
                res.add(A.get(i));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> res1 = new ArrayList<>();
        ArrayList<Integer> res2 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            arr1.add(random.nextInt(20));
            arr2.add(random.nextInt(20));
        }
        res1=arrayAminusB(arr1, arr2);
        System.out.println("Массив А : "+arr1.toString());
        System.out.println("Массив В : "+arr2.toString());
        System.out.println("А - В : "+res1.toString());
        res2=arrayAminusB(arr2, arr1);
        System.out.println("В - А : "+res2.toString());
        res1.addAll(res2);
        System.out.println("А ^ В : "+res1.toString());
    }
}
