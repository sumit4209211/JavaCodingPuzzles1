public class Singleton {
    private volatile static Singleton _instance;

    private Singleton(){


    }

    public  static  Singleton getInstance(){
        if(_instance == null){
            _instance = new Singleton();
        }
        return _instance;
    }
    public static synchronized Singleton getInstanceTS(){
        if(_instance == null){
            _instance = new Singleton();
        }
        return _instance;

    }
    public static Singleton getInstanceDC(){
        if(_instance == null){
            synchronized (Singleton.class){
                if(_instance==null){
                    _instance = new Singleton();
                }
            }
        }
        return _instance;
    }
}
