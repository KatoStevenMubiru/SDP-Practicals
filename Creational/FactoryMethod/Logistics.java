abstract class Logistics{
    //Factory Method
    public abstract Transport createTransport();

    public void planDelivery(){
        Transport tp = createTransport();
        tp.deliver();
    }

}