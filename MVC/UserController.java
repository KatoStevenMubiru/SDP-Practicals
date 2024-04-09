package MVC;

public class UserController {
    private UserModel model;
    private UserView view;

    public UserController(UserModel model, UserView view){
        this.model = model;
        this.view = view;
    }
    //setters
    public void  setUserName(String name){
        model.setName(name);
    }
    public void setUserEmail(String email){
        model.setEmail(email);
    }
    //getters
    public String getUserName(){
        return model.getName();
    }
    public String getUserEmail(){
        return model.getEmail();
    }

     public void updateView(){
        view.printUserDetails(model.getName(),model.getEmail());
     }
}
