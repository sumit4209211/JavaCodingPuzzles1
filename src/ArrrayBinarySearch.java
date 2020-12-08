import java.util.Arrays;
 class ArraySearch {
    public static void main(String[] args) {
        String input[]={"D","G","T","F","Z"};
        Arrays.sort(input);
        System.out.println(Arrays.binarySearch(input,"Z"));
        for(String output:input){
            System.out.println(output);
        }
    }
}