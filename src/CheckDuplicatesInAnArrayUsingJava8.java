import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckDuplicatesInAnArrayUsingJava8 {
    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 2, 4, 2));
        List<Integer> collect = integerArrayList.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
