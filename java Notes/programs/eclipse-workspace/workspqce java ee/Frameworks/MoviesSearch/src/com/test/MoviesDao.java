package com.test;

//package com.test;


import org.springframework.orm.hibernate5.HibernateTemplate;

import antlr.collections.List;

public class MoviesDao {

	  private HibernateTemplate template;

	  public void setTemplate(HibernateTemplate template) {
		  this.template = template;
	  }
	  public HibernateTemplate getTemplate() {
		return template;
	  }
	  
	  Movies getMovies(int Srno) {
		  return this.template.get(Movies.class, Srno);
	  }

}

	//   List<Movies> getAllMovies() {
		//	return this.template.loadAll(Movies.class);
	  //}
	  

