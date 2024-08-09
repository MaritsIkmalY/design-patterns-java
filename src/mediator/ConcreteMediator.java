package mediator;

import homepage.HomePageView;
import login.LoginView;
import onboarding.OnboardingView;
import register.RegisterView;

public class ConcreteMediator implements MediatorInterface {
    OnboardingView onboardingView;
    LoginView loginView;
    RegisterView registerView;
    HomePageView homePageView;

    public void goToOnboardingView() {
        onboardingView = new OnboardingView("Welcome to Onboarding");

        onboardingView.createFeatures("Feature 1", "This is feature 1");

        onboardingView.createFeatures("Feature 2", "This is feature 2");

        onboardingView.setMediator(this);

        onboardingView.showOnboardingView();
    }

    @Override
    public void notify(Object sender, String route) {
        if (sender instanceof OnboardingView && route.equals(OnboardingView.ROUTELOGIN)) {
            loginView = new LoginView("Welcome to LoginView");

            loginView.setMediator(this);

            loginView.showLoginView();

            loginView.onClickRegisterButton();
        } else if (sender instanceof LoginView && route.equals(LoginView.ROUTEHOMEPAGE)) {
            homePageView = createHomePageView();
            homePageView.showHomePage();
        } else if (sender instanceof LoginView && route.equals(LoginView.ROUTEREGISTER)) {
            registerView = new RegisterView("Welcome to RegisterView");

            registerView.setMediator(this);

            registerView.showRegisterView();

            registerView.onClickRegisterButton();
        } else if (sender instanceof RegisterView && route.equals(RegisterView.ROUTELOGIN)) {
            loginView = new LoginView("Welcome to LoginView");

            loginView.setMediator(this);

            loginView.showLoginView();
        } else if (sender instanceof RegisterView && route.equals(RegisterView.ROUTEHOMEPAGE)) {
            homePageView = createHomePageView();
            homePageView.showHomePage();
        }
    }

    public HomePageView createHomePageView() {
        homePageView = new HomePageView("Welcome to HomePageView");

        homePageView.setMediator(this);

        return homePageView;
    }

}
