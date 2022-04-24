package com.pga;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.google.gson.Gson;

@Controller
public class StudentController {
	@Autowired
	private StudentDao studentDao;

	@RequestMapping(value="/students", method=RequestMethod.GET,
			produces = "application/json")
	@ResponseBody
	public String getAll() {
		List<Student> list = studentDao.getAllStudents();
		 Gson gson = new Gson();
		 String result = gson.toJson(list);
		return result;
	}
	
	@RequestMapping(value="/student/{id}", method=RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String getStudentById(@PathVariable("id") int id) {
		Student s = studentDao.getStudent(id);
		 Gson gson = new Gson();
		 String result = gson.toJson(s);
		return result;
	}

}
