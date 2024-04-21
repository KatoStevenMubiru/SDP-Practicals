package Behavourial.Command;

/**
 * Application
 */
public class Application {

    public static void main(String[] args) {
        Document document = new Document();
        Command copy = new CopyCommand(document);
        Command paste = new PasteCommand(document);

        Button copyButton = new Button(copy);
        Button pasteButton = new Button(paste);
    }
}