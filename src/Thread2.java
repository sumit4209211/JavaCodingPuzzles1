public class Thread2 {
    public static void main(String[] args) {
        String a= "FalabellaIndia";
        String b = new String(a);
        int value=0;
        value= (a ==b) ?1 :2;
        if(value==1){
            System.out.println("FalabellaIndia");
        }else if(value==2){
            System.out.println("Falabella India");
        }
        else{
            System.out.println("Falabella Chile");
        }
    }
}
