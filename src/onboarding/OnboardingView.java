package onboarding;

import mediator.MediatorInterface;

import java.util.ArrayList;
import java.util.List;

public class OnboardingView {
    MediatorInterface mediator;
    String title;
    List<OnboardingFeature> features  = new ArrayList<>();;

    public static final String ROUTELOGIN = "Go to login";

    public OnboardingView(String title){
        this.title = title;
    }

    public void setMediator(MediatorInterface mediator){
        this.mediator = mediator;
    }

    public void createFeatures(String title, String description) {
        features.add(new OnboardingFeature(title, description));
    }

    public void showOnboardingView() {
        System.out.println(title);
        for (OnboardingFeature feature : features) {
            System.out.println(feature.title + ": " + feature.description);
        }

        mediator.notify(this, ROUTELOGIN);
    }
}
