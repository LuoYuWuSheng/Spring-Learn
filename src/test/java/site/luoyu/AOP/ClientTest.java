package site.luoyu.AOP;

import org.apache.camel.test.spring.CamelSpringTestContextLoader;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import site.luoyu.AOP.annotation.Knight;

import static org.junit.Assert.*;

/**
 * Created by luoyu on 2016/8/22 0022.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {
        "classpath:/META-INF/spring/camel-context.xml",
        "classpath:/META-INF/spring/camel-propertyEdit.xml"
})
public class ClientTest {

/*
    这里是利用手动创建工厂的方式
    下面的是 @Runwith注解自动创建
    @Test
    public void aopTest() throws Exception {
        Client client = new Client();
        client.AopTest();
    }
*/
    @Autowired
    private UserManager userManager;

    @Autowired
    private Knight knight;

    @Test
    public void aopTest(){
        userManager.addUser("张三", "123");
        userManager.deleteUser(1);

        knight.fight();
    }
}