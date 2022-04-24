package com.test;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
