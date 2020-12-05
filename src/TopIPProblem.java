import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

class Top_Ip_Problem {
    public static void main(String[] args) {
        String lines[] = {"10.0.0.1 - log entry 1 11", "10.0.0.1 - log entry 1 11", "10.0.0.1 - log entry 1 11", "10.0.0.1 - log entry 1 11", "10.0.0.1 - log entry 2 213", "10.0.0.2 - log entry 133132", "10.0.0.2 - log entry 133132", "10.0.0.2 - log entry 133132", "10.0.0.5 - log entry 133132", "10.0.0.2 - log entry 133132", "10.0.0.2 - log entry 133132", "10.0.0.2 - log entry 133132", "10.0.0.5 - log entry 133132", "10.0.0.71 - log entry 133132", "10.0.0.3 - log entry 133132", "10.0.0.3 - log entry 133132", "10.0.0.3 - log entry 133132","10.0.0.1 - log entry 1 11", "10.0.0.1 - log entry 1 11"};
        System.out.println(findTopIpaddress(lines));
    }


    public static String findTopIpaddress(String[] lines) {
        // Your code goes here
        TreeMap<String,Integer> treeMap = new TreeMap();
        for (String s : lines) {
            s = s.substring(0, 8);
            if (treeMap.containsKey(s)) {

                treeMap.put(s, (int) treeMap.get(s) + 1);
            } else {
                treeMap.put(s, 1);
            }
        }

        Object[] integers = (Object[]) treeMap.values().toArray();
        Arrays.sort(integers);

        System.out.println(treeMap);
        /* System.out.println(integers[integers.length - 1]);*/
        String out="";
        for (Map.Entry<String, Integer> em : treeMap.entrySet()) {

            if (em.getValue().equals(integers[integers.length - 1])) {
                out= em.getKey();
            }

        }
        return out.toString();
    }
}

