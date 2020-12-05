public class CheckMinimumValueInAnArray {
  //Returns minimum value from given Array
    public static int findMinimum(int[] arr){
        int minimum=arr[0];
        //At every index compare its value with minimum if its less
        //then make that index value new min value
        for (int i=1;i<arr.length;i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        int [] arr={9,2,3,7};
        System.out.println("Array: ");
    }
}
