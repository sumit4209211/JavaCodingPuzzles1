import java.util.*;
import java.util.LinkedList;
import java.util.stream.Collectors;

 class CountFrequenceOfCharactersInAStringJava8 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("SUMIT", "ABCD", "AAA");
         names.stream().map(i->i.length()).forEach(System.out::println);
        List<Integer> collect = names.stream().map(i -> i.length()).collect(Collectors.toList());
        System.out.println(collect);
        List<Integer> freqs = new LinkedList<>();

    }
}