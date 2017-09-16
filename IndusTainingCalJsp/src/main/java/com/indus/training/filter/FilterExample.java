package com.indus.training.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterExample implements Filter {

	public FilterExample() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("filtering request");
		chain.doFilter(request, response);
		System.out.println("enhnacing response");
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
