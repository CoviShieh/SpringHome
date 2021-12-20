import com.kuang.demo1.pojo.A;
import com.kuang.demo1.pojo.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiewh
 * @create 2021-12-15 13:47
 * @Description
 */
public class test {

    public static void main(String[] args) {
        //获取spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        A a = (A)context.getBean("a");
        B b = (B)context.getBean("b");
    }

}
