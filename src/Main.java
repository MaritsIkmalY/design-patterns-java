package mediator;

import dataprovider.DataProviderContext;
import api.ApiDataProvider;
import sqlite.SqliteDataProvider;
public class Main{
    public static final String ROUTE = "Onboarding";

    public static void main(String[] args) {
        Main mainInstance = new Main();

        DataProviderContext apiDataProviderContext = new DataProviderContext(new ApiDataProvider());
        apiDataProviderContext.connect();

        DataProviderContext sqliteDataProviderContext = new DataProviderContext(new SqliteDataProvider());
        sqliteDataProviderContext.connect();

        ConcreteMediator mediator = new ConcreteMediator();
        mediator.notify(mainInstance, Main.ROUTE);
    }
}