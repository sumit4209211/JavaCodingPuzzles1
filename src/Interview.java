import java.util.*;

public class Interview
{

  public  static void printDuplicateCharaceters(String str){
      Map<Character,Integer> characterIntegerMap = new HashMap<>();
      char[] charArray= str.toCharArray();
      for(char c: charArray){
          if(characterIntegerMap.containsKey(c)){
              characterIntegerMap.put(c,characterIntegerMap.get(c)+ 1);
          }
          else
          {
              characterIntegerMap.put(c,1);
          }
      }
      for(Map.Entry<Character,Integer> entry: characterIntegerMap.entrySet()){
          if(entry.getValue()>1){
              System.out.println(entry.getKey() + " : " + entry.getValue());
          }
      }
  }
    public static void main(String[] args) {
       // List<Employee> employees = new ArrayList<>();
     //
        String str="healthedge";
        printDuplicateCharaceters(str);



    }
}
