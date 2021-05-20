package servlet;

import biz.UserBiz;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by gjx on 2020/9/12.
 */
public class ChangSelfInfoServlet extends HttpServlet {
    private User user;
    private UserBiz userBiz;
    public void init()throws ServletException {
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");
        String name=req.getParameter("name");
        String uname=req.getParameter("uname");
        String upass=req.getParameter("upass");
        String status =req.getParameter("status");
        String love=req.getParameter("love");
        String phone=req.getParameter("phone");
        userBiz=new UserBiz();
        user=new User(name,uname,upass,status,love,phone);
        userBiz.changeInfo(name,uname,upass,status,love,phone);
        req.getSession().setAttribute(user.getUname(),user);    //session中传入一个名为该user uname的user对象
        if(user.getStatus().equals("diner"))
            req.getRequestDispatcher("dinerInterface.jsp").forward(req,res);
        else
            req.getRequestDispatcher("staffInterface.jsp").forward(req,res);
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        doPost(req,res);
    }
}
