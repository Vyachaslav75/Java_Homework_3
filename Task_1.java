import java.util.ArrayList;
import java.util.Random;

public class Task_1 {
    private static ArrayList<Integer> sortMerge(ArrayList<Integer> arr){
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (arr.size() > 1) {
            ArrayList<Integer> arrTmp1 = new ArrayList<Integer>(arr.subList(0, arr.size()/2));
            ArrayList<Integer> arrTmp2 = new ArrayList<Integer>(arr.subList(arr.size()/2, arr.size()));

            arrTmp1=sortMerge(arrTmp1);
            arrTmp2=sortMerge(arrTmp2);

            while (arrTmp1.size()>0 || arrTmp2.size()>0) {
                if (arrTmp1.size()>0 && arrTmp2.size()>0){
                    if (arrTmp1.get(0)<arrTmp2.get(0)){
                        res.add(arrTmp1.remove(0));
                    }else{
                        res.add(arrTmp2.remove(0));
                    }
                } else if (arrTmp1.size()==0 && arrTmp2.size()>0) {
                    res.add(arrTmp2.remove(0));
                } else if (arrTmp1.size()>0 && arrTmp2.size()==0) {
                    res.add(arrTmp1.remove(0));
                }
            }
        }else {
            return arr;
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            arr.add(random.nextInt(20));
        }

        System.out.println(arr.toString());
        arr=sortMerge(arr);
        System.out.println(arr.toString());


    }
}
