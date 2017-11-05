package dao.impl;

import dao.UserDao;
import entity.User;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

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

    public void select_get() {
        User user = hibernateTemplate.get(User.class,1);
        System.out.println(user.getUsername()+" "+user.getPassword()+" "+user.getSalary());
    }

    public void select_find1() {
       List<User> list= (List<User>) hibernateTemplate.find("from User");
       for (User user :list){
           System.out.println(user.getUsername()+" "+user.getPassword()+" "+user.getSalary());
       }
    }

    public void select_find2() {
        // 分页
        // hibernateTemplate.findByCriteria();
        List<User> list= (List<User>) hibernateTemplate.find("from User where id = ?",3);
        for (User user :list){
            System.out.println(user.getUsername()+" "+user.getPassword()+" "+user.getSalary());
        }
    }

    public void update_test() {
        User user = hibernateTemplate.get(User.class,3);
        user.setUsername("dada");
        user.setPassword(666666);
        user.setSalary(2000);
        hibernateTemplate.update(user);
    }

    public void delete_test() {
        User user = hibernateTemplate.get(User.class,13);
        hibernateTemplate.delete(user);
    }


}
