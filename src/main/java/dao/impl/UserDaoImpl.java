package dao.impl;

import dao.UserDao;
import entity.User;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class UserDaoImpl implements UserDao {
    /*
        得到hibernate原理
        HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
        hibernateTemplate.save(entity);
    */

    //注入hibernateTemplate
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void add() {
        User user = new User();
        user.setUsername("张三");
        user.setPassword(123456);
        user.setSalary(1000);
    hibernateTemplate.save(user);
    }
}
