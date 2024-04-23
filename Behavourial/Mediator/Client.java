package Behavourial.Mediator;

public class Client {
    public static void main(String[] args) {
        ProfileDialog dialog = new ProfileDialog();
        dialog.hasDogCheckbox.check();
        dialog.submitButton.click();
    }
    
}
