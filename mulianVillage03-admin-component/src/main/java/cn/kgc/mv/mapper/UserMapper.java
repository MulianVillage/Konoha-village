package cn.kgc.mv.mapper;

import cn.kgc.mv.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: czm
 * @Date: 2020/8/8 9:01
 */
public interface UserMapper {

    /*查询手机号是否被注册*/
    public String getPhone(@Param("phone") String phone);

    /*查询用户名是否存在*/
    public String getUserName(@Param("username") String username);

    /*增加用户*/
    public Integer saveUser(User user);

    /*根据用户名密码查询用户*/
    public User queryUser(User user);

}
