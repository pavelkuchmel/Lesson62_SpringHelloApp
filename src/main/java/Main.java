import example.TestBean;
import example.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //TestBean testBean = classPathXmlApplicationContext.getBean("testBean", TestBean.class);
        UserService userService = classPathXmlApplicationContext.getBean("userService", UserService.class);
        System.out.println(userService.getUserDAO().getSessionFactory().getConfiguration().getName());
    }
}
