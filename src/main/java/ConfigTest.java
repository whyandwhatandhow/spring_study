import com.config.SpringConfig;
import com.dao.UserDao;
import com.domain.User;
import com.mapper.UserMapper;
import com.sevice.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ConfigTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.show();
    }
}
