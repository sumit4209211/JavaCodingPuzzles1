public class RaceConditionDemo implements Runnable{
    private int c =0;
    public void increment(){
        try{
            Thread.sleep(10);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        c++;
    }
    public void decrement()
    {
        c--;
    }
    public int getValue(){
        return c;
    }

    @Override
    public void run() {
        synchronized (this) {
            this.increment();
            System.out.println("Value for thread after increment" + Thread.currentThread().getName() + " " + this.getValue());

            this.decrement();
            System.out.println("Value for thread after decrement" + Thread.currentThread().getName() + " " + this.getValue());

        }
    }

    public static void main(String[] args) {
        RaceConditionDemo raceConditionDemo = new RaceConditionDemo();
        Thread t1 = new Thread(raceConditionDemo, "Thread-1");
        Thread t2 = new Thread(raceConditionDemo, "Thread-2");
        Thread t3 = new Thread(raceConditionDemo, "Thread-3");
        t1.start();
        t2.start();
        t3.start();
    }
}
