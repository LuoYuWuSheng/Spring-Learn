package site.luoyu.DI;

import java.util.Date;

/**
 * Created by luoyu on 2016/8/19 0019.
 */
public class DateBean {
    private Date date;

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 打印日期
     */
    public void showDate(){
        System.out.println(date);
    }
}
