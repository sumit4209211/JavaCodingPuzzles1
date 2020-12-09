import java.util.regex.MatchResult;

public class ThreadHelloWorld44 implements   Runnable{

    private final String toPrint;
    private final boolean print;
    private final Object lock;
    private static boolean printHello= true;

    public ThreadHelloWorld44(String toPrint, boolean print,Object lock) {
        this.toPrint = toPrint;
        this.lock = lock;
        this.print = print;
    }


    public static void main(String[] args) {
        Object lock= new Object();

        new Thread(new ThreadHelloWorld44("Hello",true,lock)).start();

        new Thread(new ThreadHelloWorld44("World",false,lock)).start();

    }

     @Override
    public void run(){
        for (int i=0;i <10 && !Thread.currentThread().isInterrupted();)
        {
            synchronized (lock){
                if(print==printHello)
                {
                    System.out.println(toPrint);
                    printHello = !printHello;
                    lock.notify();
                    i++;
                }
                else{
                    try {

                        lock.wait();
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        }
     }
}
