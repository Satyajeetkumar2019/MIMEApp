package com.bce.servlet;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Servlet implementation class WordServlet
 */
@WebServlet("/WordServlet")
public class WordServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException ,IOException{
		//getprintWriter
		PrintWriter pw=res.getWriter();
		//set response
		res.setContentType("application/msword");
		//Write logic to get out put 
		pw.println("<table border='1'>");
		pw.println("<tr><th>player</th> <th>Role</th> </tr>");
		pw.println("<tr><th>dhoni</th> <th>caption</th> </tr>");
		pw.println("<tr><th>sachin</th> <th>All Rounder</th> </tr>");
		pw.println("</table>");
		pw.close();
		}//end of the service(--)
	
	
	
}//end of the class
