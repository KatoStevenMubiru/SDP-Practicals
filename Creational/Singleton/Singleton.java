package Creational.Singleton;

public class Singleton {
    // must be private
    private static volatile Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){

        if(instance == null){

            synchronized(Singleton.class){

                if(instance = null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
