import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeList {
    public static void main(String[] args) {
        List list1 = Arrays.asList(101,102,103);
        List list2 = Arrays.asList(201,202,203);

        List merged= new ArrayList(list1);
        merged.addAll(list2);


        System.out.println(merged);

        
    }


}
