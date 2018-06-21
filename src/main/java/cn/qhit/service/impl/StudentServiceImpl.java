package cn.qhit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qhit.domain.po.Student;
import cn.qhit.mapper.StudentMapper;
import cn.qhit.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;
	@Override
	public List<Student> findStudentAll() {
		// TODO Auto-generated method stub
		return studentMapper.findStudentAll();
	}

}
