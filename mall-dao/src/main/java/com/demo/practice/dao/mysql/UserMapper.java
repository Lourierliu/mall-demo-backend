package com.demo.practice.dao.mysql;

import com.demo.practice.common.entity.dos.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {


    UserDO getUser(@Param("id") int id);

    List<UserDO> getUserList();
}
