import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class CheckDuplicatesUsingHashMap {

    public void hasDuplicatesUsingMap(int[] arrA) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arrA.length; i++) {
            if (map.containsKey(arrA[i])) {
                System.out.println("Array has duplicates : " + Math.abs(arrA[i]));
            } else {
                map.put(arrA[i], 1);
            }
        }
    }

    public static void main(String[] args) {

            int a [] = {1, 6, 5, 2, 3, 3, 2};
            new CheckDuplicatesUsingHashMap().hasDuplicatesUsingMap(a);
        List<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 2, 4, 2));
        List<Integer> collect = integerArrayList.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);


    }
}