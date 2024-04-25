import java.util;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.Subscriber;

//This is the concrete publisher that triggers events and resp notifications
public class MagazinePublisher {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestIssue;

    public void publishNewIssue(String issue){
        this.latestIssue = issue;
        notifySubscribers();
    }

    @Override
    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    @Override
    public void notifySubscribers(){
        for(Subscriber subscriber: subscribers){
            subscriber.update(latestIssue);
        }
    }
}