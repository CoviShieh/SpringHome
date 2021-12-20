import com.kuang.demo2.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiewh
 * @create 2021-12-17 11:10
 * @Description
 */
public class Mytest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContent.xml");

        UserService userService = (UserService)context.getBean("userService");

        userService.delete();
    }
}
