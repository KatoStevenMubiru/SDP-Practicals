import java.util;
import java.util.ArrayList;
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
    
}