package Behavourial.Command;

import javax.swing.text.Document;

/**
 * PasteCommand
 */
public class PasteCommand implements Command{
    private Document document;

    public PasteCommand(Document document){
        this.document = document;
    }
    @Override
    public void execute(){
        document.paste();
    }
    
}