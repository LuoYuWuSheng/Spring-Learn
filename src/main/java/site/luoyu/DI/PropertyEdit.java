package site.luoyu.DI;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by luoyu on 2016/8/19 0019.
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
