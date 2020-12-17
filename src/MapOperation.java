import java.util.*;
public class MapOperation {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        Collections.unmodifiableMap(map);
        map.put("b",2);
        System.out.println(map);
    }
}
