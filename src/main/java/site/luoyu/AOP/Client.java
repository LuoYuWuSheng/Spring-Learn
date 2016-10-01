package site.luoyu.AOP;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public void AopTest() {
        BeanFactory factory = new ClassPathXmlApplicationContext("/META-INF/spring/*.xml");

        UserManager userManager = (UserManager) factory.getBean("UserManager");

        userManager.addUser("张三", "123");
        userManager.deleteUser(1);
    }
}
