package site.luoyu.AOP.annotation;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Computer user xd
 * Created by 张洋 on 2017/2/14.
 * 尝试用注解的方式配置AOP
 */
@Component
public class Knight {

    public void fight(){
        System.out.println("骑士战斗");
    }
}
