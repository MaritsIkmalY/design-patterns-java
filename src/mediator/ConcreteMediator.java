package mediator;

import onboarding.OnboardingView;

public class ConcreteMediator implements MediatorInterface {
    OnboardingView onboardingView;

    @Override
    public void notify(Object sender, String route) {
        System.out.println("Mediator notified by " + sender + " with route " + route);
        if (sender instanceof Main && route.equals(Main.ROUTE)) {
            onboardingView = new OnboardingView("Welcome to Onboarding");
            onboardingView.createFeatures("Feature 1", "This is feature 1");
        }
    }
}
