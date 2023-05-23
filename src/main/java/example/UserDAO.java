package example;

public class UserDAO {
    private SessionFactory sessionFactory;

    public UserDAO() {}

    public UserDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public String toString() {
        return "UserDAO{" +
                "sessionFactory=" + sessionFactory +
                '}';
    }
}
