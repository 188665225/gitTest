package cn.qhit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qhit.domain.po.Student;
import cn.qhit.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping(value="all")
	public String findAll(Model model) {
		List<Student> stus = studentService.findStudentAll();
		model.addAttribute("stu", stus);
		return "index";
	}

}
