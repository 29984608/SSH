package service;

import dao.UserDao;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void test(){
        userDao.add();
        userDao.select_get();
        userDao.select_find1();
        userDao.select_find2();
        userDao.update_test();
        userDao.delete_test();
    }
}
