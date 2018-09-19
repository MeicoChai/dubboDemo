import com.chai.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: minquan.chai@hand-china.com
 * @Modificd By:
 * @Date: Created in chai on 2018/9/19.
 */
public class DubboConsumer {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consume.xml");
        HelloService service = (HelloService) context.getBean("helloService");
        System.out.println(service.sayHello());
    }
}
