package api;

import dataprovider.DataProviderStrategy;

public class ApiDataProvider implements DataProviderStrategy {
    @Override
    public void connect() {
        System.out.println("Connecting to API");
    }
}
