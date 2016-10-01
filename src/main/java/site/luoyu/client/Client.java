package site.luoyu.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import site.luoyu.Context.InjectComponent;
import site.luoyu.DI.DateBean;
import site.luoyu.manager.IUserManager;

/**
 * Created by luoyu on 2016/8/18 0018.
 */
public class Client {

    public static InjectComponent injectComponent;
    @Autowired
    public static void setInjectComponent(InjectComponent injectComponent) {
        Client.injectComponent = injectComponent;
    }

    public static void main(String[] args) {
//        UserManager manager = new UserManager(new MysqlDao());
//        manager.save();
        BeanFactory factory = new ClassPathXmlApplicationContext("/META-INF/spring/*.xml");
        IUserManager manager = (IUserManager) factory.getBean("Manager");
        //        manager.save();
        DateBean db = (DateBean) factory.getBean("DateBean");
        db.showDate();

//        InjectComponent injectComponent = new InjectComponent();
        injectComponent.showComponentBean();


    }
}
