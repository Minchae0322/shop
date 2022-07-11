package cn.edu.hit.controller.dao;

import org.apache.ibatis.annotations.Select;

public interface UserDao {

    @Select("select count(*) from `user`"  )
    int test();
}
