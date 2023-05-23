package example;

public class SessionFactory {
    private Configuration configuration;

    public SessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    public SessionFactory() {}

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public String toString() {
        return "SessionFactory{" +
                "configuration=" + configuration +
                '}';
    }
}
