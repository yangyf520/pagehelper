package com.example.demo.service.impl;

import com.example.demo.dao.BaseDao;
import com.example.demo.dao.cluster.StudentDao;
import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
* 用户操作实现类
 */
@Service
public class StudentServiceImpl extends BaseServiceImpl<Student>  implements StudentService {
	@Autowired
	private StudentDao studentDao;
	
	@Override
	protected BaseDao<Student> getMapper() {
		return this.studentDao;
	}
	
}
