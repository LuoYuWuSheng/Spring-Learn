package site.luoyu.DI;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by luoyu on 2016/8/19 0019.
 * 自定义的属性编辑器，用于将字符串转换为想要的类型，然后返回到编辑器中。
 */
public class PropertyEdit extends PropertyEditorSupport{

    public void setFormat(String format) {
        this.format = format;
    }

    private String format = "yyyy-MM-dd";
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        try {
            Date date = simpleDateFormat.parse(text);
            setValue(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
