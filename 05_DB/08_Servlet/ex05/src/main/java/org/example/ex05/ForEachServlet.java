package org.example.ex05;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/jstl2")
public class ForEachServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	// MIME 타입 설정
	response.setContentType("text/html;charset=UTF-8");

	// 자바 I/O
	PrintWriter out = response.getWriter();

	// html 작성
	out.println("<html><body>");
	out.println("");
	out.println("</body></html>");
    }
}
