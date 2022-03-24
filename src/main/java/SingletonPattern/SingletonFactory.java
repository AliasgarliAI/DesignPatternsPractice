package SingletonPattern;

public class SingletonFactory {
    private SingletonFactory(){}
    private  static SingletonFactory instance;
//    private final static SingletonFactory instance = new SingletonFactory();
//
//    public static SingletonFactory getInstance(){
//        return instance;
//    }
//

    private static void instanceCreator(){
        instance = new SingletonFactory();
    }
    public static SingletonFactory getInstance(){
        return instance;
    }



}
