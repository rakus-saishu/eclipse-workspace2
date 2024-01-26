package web_basic.ch09; //サーブレットはjavaフォルダに！！

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UseForwardServlet1 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		System.out.println("サーブレットの実行");
		RequestDispatcher dispatcher =  request.getRequestDispatcher("/view/ch09/useForward.jsp");
		dispatcher.forward(request, response);
		System.out.println("サーブレットの終了");
	}	
	
}
