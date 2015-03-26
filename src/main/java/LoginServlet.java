package main.java;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *ログインサーブレット
 */
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException, IOException{

		request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);

	}
}