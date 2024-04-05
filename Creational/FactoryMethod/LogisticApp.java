public class LogisticApp{
    public static void main(Strings arg[]){
        Logistics logistics = new RoadLogistics();
        logistics.planDelivery();

        logistics = new SkyLogistics();
        logistics.planDelivery();
    }
}