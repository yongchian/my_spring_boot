package com.edu.spring;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user.do")
public class UserServlet extends HttpServlet {

  private static final long serialVersionUID = -6984407228461963207L;

  protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
    try {
      resp.getWriter().print("in the userServlet");
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
