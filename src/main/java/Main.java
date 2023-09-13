import com.alibaba.druid.pool.DruidDataSource;
import com.dao.UserDao;
import com.sevice.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service=context.getBean(UserService.class);
        service.show();
    }
}
