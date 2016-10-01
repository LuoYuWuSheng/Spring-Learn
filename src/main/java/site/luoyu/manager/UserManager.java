package site.luoyu.manager;

import site.luoyu.dao.IUserDao;

/**
 * Created by luoyu on 2016/8/18 0018.
 */
public class UserManager implements IUserManager {


    private IUserDao userDao;

    public UserManager() {
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public UserManager(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save("zhang","hahaha");
    }
}
