package site.luoyu.Context;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Created by luoyu on 2016/8/21 0021.
 */

@Component
public class ComponentBean {
    public String getName() {
        return name;
    }

    public String name = " component 组件";
}
