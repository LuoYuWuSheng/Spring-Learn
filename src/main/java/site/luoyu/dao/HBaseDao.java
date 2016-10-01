package site.luoyu.dao;

/**
 * Created by luoyu on 2016/8/18 0018.
 */
public class HBaseDao implements IUserDao{

    @Override
    public void save(String userName, String passwd) {
        System.out.println("Hbase save name "+userName+ " passwd " + passwd);
    }
}
