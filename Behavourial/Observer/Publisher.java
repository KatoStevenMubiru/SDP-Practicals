import java.util.List;
import java.util.concurrent.Flow.Subscriber;
//Defines the methods any publisher must implement i.e subscribing and unsubscribing.
public interface Publisher {
      void subscribe(Subscriber subscribe);
      void unsubscribe(Subscriber subscribe);
      void notifySubscribers();
    
}