package SOLID.LSP.AfterLSP;

public class EditableDocument implements Document {
    public void read(){
        System.out.println("Reading document.");
    }
    public void save(){
        System.out.println("Document saved.")
    }
}
