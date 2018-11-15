package cn.lyq.utest;

import cn.itcast.domain.User;
import org.junit.Test;

import java.sql.*;

public class UserTest {

    @Test
    public void userTest1(){

        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@192.168.25.128:1521:xe";
        String username = "ssmpartice";
        String password = "123";


        //加载驱动
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);
            CallableStatement call = con.prepareCall("SELECT  * FROM  USER1");
            ResultSet rs = call.executeQuery();
            User user = new User();
            while (rs.next()){
                Object uname = rs.getObject(1);
                Object upass = rs.getObject(2);
                System.out.println(uname);
                System.out.println(upass);
               // user.setUsername(uname);
                //user.getPassword(upass);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
