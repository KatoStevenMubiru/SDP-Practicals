public class SubscriptionService {

    public static void main(String[] args) {
        MagazinePublisher publisher = new MagazinePublisher();
        Subscriber alice = new Reader("Alice");
        Subscriber namagembe   = new Reader("Mildred");

        publisher.subscribe(alice);
        publisher.subscribe(namagembe);
    }
}