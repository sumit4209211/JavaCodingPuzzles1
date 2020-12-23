public class CodeOptimization {
    public static void main(String[] args) {
        int[]  a = {8,1};
        int [] b= {1,1,5,3};
       int[] add= add(a,b);
        for (int i = 0; i < add.length; i++) {
            System.out.print(add[i] + " ");
        }
    }
    public static int[] add(int [] first, int[] second){
        Boolean findLargest = first.length > second.length ? true : false;
        int length = first.length > second.length ? first.length : second.length;
        int[] result= new int[length];
        int carry=0;
        for(int i=0;i<length;i++){
            int count=0;
            if(findLargest){
                if(second.length>i){
                    count= first[length-(i+1)] + second[second.length -(i+1)] +carry;
                    if(count>9){
                        carry =1;
                        count = count + 10;
                    }else

                        carry=0;
                }else{
                    count=first[length-(i+1)] + carry;
                    carry=0;
                }
            }else{
                if(first.length>i){
                    count= first[first.length -(i+1)] + second[length-(i+1)] + carry;
                    if(count>9){
                        carry=1;
                        count=count-10;
                    }else
                        carry=0;
                }else{
                    count= second[length-(i+1)] + carry;
                    carry=0;
                }
            }
            result[length-i-1]=count;
        }
        return result;
    }
}
