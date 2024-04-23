package Behavourial.Mediator;

public abstract class Component {
    protected DialogMediator mediator;

    public Component(DialogMediator mediator){
        this.mediator = mediator;
    }

    public void click(){
        mediator.notify(this, "click");
    }

    public void check(){
        mediator.notify(this, "check");
    }
    
}
