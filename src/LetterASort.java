import java.util.*;



public class LetterASort {
   public static void main(String[] args)
    {
  Optional GOT = Optional.of("Game of thrones");
  String[] str = new String[10];
  Optional strOpt = Optional.ofNullable(str[9]);
        System.out.println(strOpt.isPresent());
        System.out.println(GOT.isPresent());
        }
    }


