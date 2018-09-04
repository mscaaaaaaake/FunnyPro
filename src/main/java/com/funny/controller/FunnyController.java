package com.funny.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/4 14:10
 * @version: 2.0.0
 */
public class FunnyController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        if (account == null || password == null) {
            writer.println("<html><body>");
            writer.println("<p>miss account or password</p>");
            writer.println("</body></html>");
        }else{
            if(account.equals("admin") && password.equals("123456")) {
                writer.println("<html><body>");
                writer.println("<p>welcome,"+account+"</p>");
                writer.println("</body></html>");
            }else{
                if(!account.equals("admin")) {
                    writer.println("<html><body>");
                    writer.println("<p>you got the wrong account</p>");
                    writer.println("</body></html>");
                }else if(!account.equals("123456")){
                    writer.println("<html><body>");
                    writer.println("<p>you got the wrong password</p>");
                    writer.println("</body></html>");
                }
            }
        }

    }

}
