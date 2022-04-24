package com.pga;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/*")
public class MyFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, 
			ServletResponse response, FilterChain chain) 
					throws IOException, ServletException {
		System.out.println("In FILTER **REQUEST***");
		chain.doFilter(request, response);
		System.out.println("In FILTER **RESPONSE***");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}
}



