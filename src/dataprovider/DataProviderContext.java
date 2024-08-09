package dataprovider;

public class DataProviderContext {
    private DataProviderStrategy dataProviderStrategy;

    public DataProviderContext(DataProviderStrategy dataProviderStrategy) {
        this.dataProviderStrategy = dataProviderStrategy;
    }

    public void connect() {
        dataProviderStrategy.connect();
    }
}
