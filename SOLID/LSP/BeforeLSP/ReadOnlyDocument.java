package SOLID.LSP.BeforeLSP;

public class ReadOnlyDocument  extends Document{
    @Override
    public void save(){
        throw new UnsupportedOperationException("Cannot save a read-only document.");
    }
    
}
