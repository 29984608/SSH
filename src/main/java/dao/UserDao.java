package dao;

public interface UserDao {

    /**
    得到hibernateTemplate对象
    **/

    //添加操作
    public void add();

    //get方法：根据id查询
    public void select_get();

    //find方法查询所有记录
        //第一个参数 hql语句
        //第二个参数 hql语句中的参数
    public void select_find1();

    //find方法查询所有记录
    public void select_find2();

    //修改操作
    public void update_test();

    //删除操作
    public void delete_test();

}
