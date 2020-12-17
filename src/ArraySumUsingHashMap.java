import java.util.HashMap;
public class ArraySumUsingHashMap {
    static int arr[] = new int []{1,2,3,4,5};

    static int getPairsWithSum(int n, int sum)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i< n ;i++){


            if(!hm.containsKey(arr[i]))
                hm.put(arr[i],0);

            hm.put(arr[i], hm.get(arr[i])+1);
        }
        int twice_count=0;
        for(int i=0;i<n;i++){
            if(hm.get(sum-arr[i]) != null)
                 twice_count+= hm.get(sum-arr[i]);
            if(sum- arr[i]==arr[i])
                twice_count--;
        }
        return twice_count/2;
    }

    public static void main(String[] args) {
        
    }
}
