package com.example.demo.dao.cluster;

import com.example.demo.dao.BaseDao;
import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学生Dao
 */
@Mapper
public interface StudentDao extends BaseDao<Student> {
}
