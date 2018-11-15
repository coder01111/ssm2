package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

/**
 * 帐户dao接口
 *///已经在spring容器中有了该接口的实现类，可以自动找到
public interface AccountDao {

    // 查询所有账户
    @Select("select * from account")
    public List<Account> findAll();

    // 保存帐户信息
    @Insert("insert into account (id,name,money) values (#{id},#{name},#{money})")
    @SelectKey(keyProperty = "id", before = true,resultType = Integer.class,statement = "SELECT s_seq.nextval id from dual")
    public void saveAccount(Account account);


}
