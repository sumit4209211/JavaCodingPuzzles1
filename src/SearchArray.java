/*
Suppose an array of length n sorted in ascending order is flipped at some index.
For example, the array nums = [4,5,6,7,0,1,2]

Given such array, return the index of target element in this array OR return -1 if it is not found.

Example 1:
Input: nums = [3,4,5,1,2]
Target: 3
Output: 0

Example 2:
Input: nums = [4,5,6,7,0,1,2]
Target: 0
Output: 4

 */

import java.util.*;

class SearchArray {


    public static int search(int[] nums, int target) {
        //solution here...
        for (int i=0;i <nums.length;i++)
        {
            if(nums[i]==target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Array:");
        String inv = in.nextLine();

        System.out.println("Search:");
        Integer src = Integer.parseInt(in.nextLine());


        for (String s : inv.split(",")) {
            list.add(Integer.parseInt(s));
        }

        int[] arr = list.stream().mapToInt(i -> i).toArray();
        System.out.println("Result="+search(arr,src)+
                ", Expected="+ list.indexOf(src));

    }

}