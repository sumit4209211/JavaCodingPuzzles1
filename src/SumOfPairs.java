import java.util.Arrays;

public class SumOfPairs {
    public static void pairedElement(int arr[], int sum)
    {
        int low=0;
        int high= arr.length-1;
        while(low<high){
            if(arr[low] + arr[high]==sum){
                System.out.println("The pair is {" +arr[low] + ", " +arr[high] + "}");
            }
            if(arr[low] + arr[high]>sum){
                high--;
            }
            else{
                low++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {8,1,2,4,5,1};

        pairedElement(arr,9);
    }
}
