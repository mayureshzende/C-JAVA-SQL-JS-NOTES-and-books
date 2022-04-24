package com.pga;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class Filter1 implements Filter {
	public void destroy() { }

	public void doFilter(ServletRequest request,
			ServletResponse response, FilterChain chain) 
					throws IOException, ServletException {
		System.out.println("UniversalFilter: request processing ");
		chain.doFilter(request, response);
		System.out.println("UniversalFilter: response processing ");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
