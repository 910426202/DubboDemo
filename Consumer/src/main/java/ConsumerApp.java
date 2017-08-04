import ServiceInterface.ServiceInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by panting1 on 2017/8/4.
 */
public class ConsumerApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "classpath:spring-config.xml" });
        context.start();

        ServiceInterface serviceInterface =(ServiceInterface)context.getBean("arbitraryBeanName");
        System.out.println(serviceInterface.Echo("Hello, this  is dubbo cosumer"));

        try {
            System.in.read();   // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
