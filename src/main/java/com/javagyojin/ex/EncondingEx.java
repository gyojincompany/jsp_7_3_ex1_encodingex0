package com.javagyojin.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EncondingEx
 */
@WebServlet("/EncondingEx")
public class EncondingEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EncondingEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("GET ������� ����Ǿ����ϴ�!");
		
		String name = request.getParameter("name");
		
		response.setContentType("text/html; charset=EUC-Kr");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("�ȳ��ϼ���." + name + "�� �ݰ����ϴ�.<br/>");
		writer.println("</body></html>");
		
		writer.close();
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		System.out.println("POST ������� ����Ǿ����ϴ�!");
		
		request.setCharacterEncoding("EUC-KR");//request ��ü�� �Ķ���Ͱ��� �ѱ۷� ���ڵ�
		
		String name = request.getParameter("name");
		
		response.setContentType("text/html; charset=EUC-Kr");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("�ȳ��ϼ���." + name + "�� �ݰ����ϴ�.<br/>");
		writer.println("</body></html>");
		
		writer.close();
		
	}

}
