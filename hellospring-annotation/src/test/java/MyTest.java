import com.config.MyConfig;
import com.pojo.A;
import com.pojo.C;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiewh
 * @create 2021-12-16 16:18
 * @Description
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        A a = (A)applicationContext.getBean("a");
        C c = (C)applicationContext.getBean("c");
    }
}
