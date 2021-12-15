## spring基础
### @autowire与@resource区别
1、@autowire--byType,@resource-先byName再byType
2、@autowire可以结合@qualifier()指定bean对象

### 注解
@Component:组件，放在类上，相当于<bean id=xx,class=xxx>,交给spring托管
@Repository
@Service
@Controller
--以上四个注解作用基本一样

@Value
@Scope
@Configuration

## 学习AOP
1.代理模式

