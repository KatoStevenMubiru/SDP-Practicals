import java.util.List;
//Defines the methods any publisher must implement i.e subscribing and unsubscribing.
public interface Publisher {
      void subscribe(Subscriber subscribe);
    
}