package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@Controller

public class MoviesController {
	@Autowired
	private MoviesDao moviesDao;

	@RequestMapping(value="/movies", method=RequestMethod.GET,
			produces = "application/json")
	@ResponseBody
	public String getAll() {
		List<Movies> list = moviesDao.getAllMovies();
		 Gson gson = new Gson();
		 String result = gson.toJson(list);
		return result;
	}
	
	@RequestMapping(value="/movies/*", method=RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String getMoviesById(@PathVariable("id") int id) {
		Movies s = MoviesDao.getMovies(id);
		 Gson gson = new Gson();
		 String result = gson.toJson(s);
		return result;
	}

}
