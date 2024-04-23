package Behavourial.Mediator;

public abstract class Component {
    protected DialogMediator mediator;

    public Component(DialogMediator mediator){
        this.mediator = mediator;
    }
    
}
