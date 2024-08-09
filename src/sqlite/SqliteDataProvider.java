package sqlite;

import dataprovider.DataProviderStrategy;
public class SqliteDataProvider implements DataProviderStrategy{
    @Override
    public void connect() {
        System.out.println("Connecting to SQLite");
    }
}
