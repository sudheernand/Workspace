package com.indus.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebPageServlet
 */
public class WebPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WebPageServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println(
				"<html><head><title>Sudheer Renukunta</title></head><style>body {background-color: inherit;}</style><body><h1>Sudheer Renukunta Profile</h1><div id=\"linkList\"><div id=\"linkList2\"><div id=\"lselect\"><ul><li><a href=\"\">Education</a></li><li><a href=\"\">Skills</a></li><li><a href=\"\">Summary</a></li><li><a href=\"\">Contact</a></li><li><a href=\"\">Links</a></li></ul></div></div></div></div><div id=\"preamble\"><h3><span>Software Engineer Trainee </span></h3><p class=\"p1\"><span></span></p></div></div><div id=\"supportingText\"><div id=\"explanation\"><h3><span>Education</span></h3><p class=\"p1\"><span>Texas A&M University Kingsville, Texas, Master ofScience Computer science</span></p><p class=\"p2\"><span></span></p></div><div id=\"participation\"><h3><span>Technical Skills</span></h3><p class=\"p1\"><span>C, JAVA, Visual Basic, QML, C, Python, Android ,HTML,PHP, C#, CSS,JavaScript, JQuery, MySQL, ASP .NET , SpringFramework,Hibernate</span></p></div><div id=\"benefits\"><h3><span>Summary</span></h3><p class=\"p1\"><span>Enthusiastic and hardworking computer science graduatewith experience in the industry working as software engineer.skilled programmer and problem solver with excellentcommunication,time management and team work skills. well versed inthe areas of algorithms and DataStructures,Web services ,Webdevelopment and Software Devolopment ,Software developmentLifecycle and Automation.</span></p></div><div id=\"footer\">sudheer.renukunt@gmail.com 361-228-4543</div></body></html>");
		out.flush();
	}

}
