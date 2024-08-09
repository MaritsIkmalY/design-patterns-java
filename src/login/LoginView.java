package login;

import mediator.MediatorInterface;

public class LoginView {
    String title;
    MediatorInterface mediator;
    public static final String ROUTEREGISTER = "Go To Register Page";
    public static final String ROUTEHOMEPAGE = "Go to Home Page";

    public LoginView(String title){
        this.title = title;
    }

    public void setMediator(MediatorInterface mediator){
        this.mediator = mediator;
    }

    public void onClickLoginButton(){
        mediator.notify(this, ROUTEHOMEPAGE);
    }

    public void onClickRegisterButton(){
        mediator.notify(this, ROUTEREGISTER);
    }

    public void showLoginView() {
        System.out.println(title);
    }
}
