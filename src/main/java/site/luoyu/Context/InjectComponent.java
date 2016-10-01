package site.luoyu.Context;

import org.apache.camel.BeanInject;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;

/**
 * Created by luoyu on 2016/8/21 0021.
 */

public class InjectComponent {

    @Autowired
    public void setComponentBean(ComponentBean componentBean) {
        this.componentBean = componentBean;
    }

    private ComponentBean componentBean;

    private Logger logger = LogManager.getLogger(ComponentBean.class);

    public void showComponentBean(){
        logger.info("利用扫描来查找组件 成功！" + componentBean.getName());
    }
}
