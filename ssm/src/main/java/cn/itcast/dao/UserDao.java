package cn.itcast.dao;


import cn.itcast.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

/**
 * 用户登录的接口
 */
public interface UserDao {
    /**
     * 登录方法
     *
     * @param user
     * @return
     */
    @Select("select * from user where username = #{username} and password = #{password}")
    User login(User user);

    /**
     * 查询所有的方法
     */
    @Select("select * from User1 ")
    List<User> findAll();
    @Insert("insert into account (id,username,password) values (#{id},#{username},#{password})")
    @SelectKey(keyProperty = "id", before = true,resultType = Integer.class,statement = "SELECT u_seq.nextval id from dual")
    void save(User user);
}
