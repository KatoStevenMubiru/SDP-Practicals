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
    
    @Override
    public void notify(Component sender, String event){
        if(sender == hasDogCheckbox && event.equals("check")){
            dogNameField.setVisible(true);
        } else if( sender == submitButton && event.equals("click")){
            if(validateFields()){
                System.out.println("Data submitted");
            } else{
                System.out.println("Validation failed");
            }
        }
    }
    private boolean validateFields(){

        return true;
    }
}
 