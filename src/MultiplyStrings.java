/*Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

        Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.



        Example 1:

        Input: num1 = "2", num2 = "3"
        Output: "6"
        Example 2:

        Input: num1 = "123", num2 = "456"
        Output: "56088"


        Constraints:

        1 <= num1.length, num2.length <= 200
        num1 and num2 consist of digits only.
        Both num1 and num2 do not contain any leading zero, except the number 0 itself.*/

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] store = new int[m + n];
        String output = "";
        for(int i = m-1; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                int current = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                store[j+i+1] += current;
            }
        }
        // modified store
        int carry = 0;
        for(int i = store.length -1; i >= 0; i--){
            int current = store[i] + carry;
            carry = current / 10;
            store[i] = current % 10;
        }
        // add it up
        for(int i = 0; i < store.length; i++){
            output += String.valueOf(store[i]);
        }

        // delete 0 in the string
        while(output.length() != 0 && output.charAt(0) == '0') output = output.substring(1);

        return output.length() == 0 ? "0": output;
    }
}
