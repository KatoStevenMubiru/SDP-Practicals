package Behavourial.Mediator;

public class TextField extends Component{
    private boolean visible = false;

    public TextField(DialogMediator mediator){
        super(mediator);
    }

    public void setVisible(boolean visible){
        this.visible = visible;

        System.out.println("Text field visibility: " + visible);
    }
    
}
