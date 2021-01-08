import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddOccuranceOfEveryCharacterInAString {
    public static void main(String[] args) {

                String word = "AAABBB";
                Map<String, Long> charCount= word.chars().mapToObj(c->Character.toString((char)c))
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(charCount);
    }
}
/*
    findSum (){
        Map<Character, Long> output = new HashMap<>();
        for(){
            if(isChar(str[i]){
                key = str[i];
                i++;
                while(isDigit(str[i]){
                    temp += str[i]
                    i++;
                }
                if(output.contains(key)){
                    output.put(key, Long.parseLong(temp) + output.get(key));
                } else {
                    output.put(key, Long.parseLong(temp);
                }
            }

        }

    }
  */
