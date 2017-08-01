package site.luoyu.AOP.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Computer user xd
 * Created by 张洋 on 2017/2/14.
 */
@Aspect
public class Poet {
    //    好神奇，不写类的全限名也可以
    @Pointcut("execution(* fight(..))")
    private void knightFight() {
    }

    @Before("knightFight()")
    private void sing() {
        System.out.println("诗人记录骑士打仗");
    }
}