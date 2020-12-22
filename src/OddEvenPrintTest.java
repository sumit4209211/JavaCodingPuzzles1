import java.util.concurrent.CyclicBarrier;

public class OddEvenPrintTest {
    public static boolean print = false;

    public static void main(String[] args) throws Exception{
        Thread t;
        int runs = 100000;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        long time =System.currentTimeMillis();
        t = new Thread(new OddBarrier(runs,cyclicBarrier),"Odd Thread");
        t.start();
        t = new Thread(new EvenBarrier(runs,cyclicBarrier),"Even Thread");
        t.start();
        t.join();
        System.out.println("Time using cyclic barrier " + (System.currentTimeMillis()- time) + " millseconds for runs "+ runs);

    }

}
class OddBarrier implements Runnable{
    CyclicBarrier cyclicBarrier;
    int runs;

    public OddBarrier( int runs, CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
        this.runs = runs;
    }
    public void run(){
        try{
            for(int i=1,counter =0; counter<runs; i+=2,counter++){
                if(OddEvenPrintTest.print){
                    System.out.println(i);
                }
                cyclicBarrier.await();
                cyclicBarrier.await();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class EvenBarrier implements Runnable{
    CyclicBarrier cyclicBarrier;
    int runs;
    public EvenBarrier(int runs, CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
        this.runs = runs;
    }
    public void run(){
        try{
            for(int i=2,counter=0; counter <runs ; i+=2, counter++){
                cyclicBarrier.await();
                if(OddEvenPrintTest.print){
                    System.out.println(i);
                }
                cyclicBarrier.await();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}