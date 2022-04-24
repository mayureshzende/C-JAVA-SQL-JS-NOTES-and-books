package com.pga;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

@WebFilter("/html/*")
public class Filter2 implements Filter {
	public void destroy() { }
	public void doFilter(ServletRequest request,
			ServletResponse response, FilterChain chain) 
					throws IOException, ServletException {
		System.out.println("HTML-filter: Request");
		chain.doFilter(request, response);
		System.out.println("HTML-filter: Response");
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}
}
