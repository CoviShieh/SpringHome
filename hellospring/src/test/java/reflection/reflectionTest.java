package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author xiewh
 * @create 2021-12-16 15:38
 * @Description 学习反射
 */
public class reflectionTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //获取class对象
        Class<?> clazz = Class.forName("reflection.User");
        System.out.println(clazz);

        //获取无参构造器，若没有无参构造器会报错NoSuchMethodException
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor();
        System.out.println(declaredConstructor);

        //实例化对象
        User user = (User)declaredConstructor.newInstance();
        System.out.println(user);

        Constructor<?> declaredConstructorHasParam = clazz.getDeclaredConstructor(String.class, int.class);
        User user2 = (User)declaredConstructorHasParam.newInstance("有参构造器",18);
        System.out.println(user2);

        //通过反射调用普通方法
        Method method = clazz.getDeclaredMethod("setName", String.class);
        //invoke方法第一个参数是调用的对象，第二个参数是设值
        method.invoke(user,"反射调用方法");
        System.out.println(user);

        //通过反射操作属性
        Field field = clazz.getDeclaredField("age");
        //不设置访问权限会报错IllegalAccessException
        field.setAccessible(true);
        field.set(user,99);
        System.out.println(user);



    }

}
