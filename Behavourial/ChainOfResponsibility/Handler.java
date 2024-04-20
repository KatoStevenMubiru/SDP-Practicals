package Behavourial.ChainOfResponsibility;

public interface Handler {
    void setNext(Handler handler);
    void handle(String message);
}
