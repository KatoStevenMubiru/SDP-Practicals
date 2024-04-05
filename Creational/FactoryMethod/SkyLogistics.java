class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport(){
        return new Plane();
        
    }
}