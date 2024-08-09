package register;

import mediator.MediatorInterface;

public class RegisterView {
    String title;
    MediatorInterface mediator;

    public static final String ROUTELOGIN = "Go to login";

    public static final String ROUTEHOMEPAGE = "Go to home page";

    public RegisterView(String title){
        this.title = title;
    }

    public void setMediator(MediatorInterface mediator){
        this.mediator = mediator;
    }

    public void onClickLoginButton(){
        mediator.notify(this, ROUTELOGIN);
    }

    public void onClickRegisterButton(){
        mediator.notify(this, ROUTEHOMEPAGE);
    }

    public void showRegisterView() {
        System.out.println(title);
    }
}
