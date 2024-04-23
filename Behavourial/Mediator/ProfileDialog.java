package Behavourial.Mediator;

public class ProfileDialog implements DialogMediator{
    private Textfield dogNameField;
    private Checkbox hasDogCheckbox;
    private Button submitButton;

    public ProfileDialog(){
        dogNameField =  new TextField(this);
        hasDogCheckbox = new Checkbox(this);
        submitButton = new Button(this);
    }
    
}
 