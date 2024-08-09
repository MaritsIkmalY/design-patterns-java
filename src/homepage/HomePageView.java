package homepage;

import mediator.MediatorInterface;

public class HomePageView {
    String title;
    MediatorInterface mediator;

    public HomePageView(String title){
        this.title = title;
    }

    public void setMediator(MediatorInterface mediator){
        this.mediator = mediator;
    }

    public void showHomePage() {
        System.out.println(title);
    }
}
