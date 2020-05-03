package com.example.demo.dao.master;

import com.example.demo.dao.BaseDao;
import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户Dao
 */
@Mapper
public interface UserDao extends BaseDao<User> {
}
