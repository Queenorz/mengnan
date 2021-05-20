package servlet;
import biz.UserBiz;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    private User user;
    private UserBiz userBiz;
    public void init()throws ServletException{
    }
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");
        String uname=req.getParameter("uname");
        String upass=req.getParameter("upass");
        String status =req.getParameter("status");
        userBiz=new UserBiz();
        user=userBiz.findUser(uname);
        if(userBiz.checkLogin(uname,upass)&&status.equals("diner")&&user.getStatus().equals("diner")){
            req.getSession().setAttribute("user",user);  //session中传入一个名为该user uname的user对象
            res.sendRedirect("getAllMemuInfoServlet");
            //req.getRequestDispatcher("qiantai/index.jsp").forward(req,res);
        }
        if(userBiz.checkLogin(uname,upass)&&status.equals("staff")&&user.getStatus().equals("staff")){
            req.getSession().setAttribute("user",user);
            //res.sendRedirect("getAllMemuInfoServlet");
            req.getRequestDispatcher("admin/index.jsp").forward(req,res);  //session中传入一个名为该user uname的user对象
        }
        else{
            res.setCharacterEncoding("UTF-8");
            res.setContentType("text/html; charset=UTF-8");
            PrintWriter pw =res.getWriter();
            pw.println("<script type=\"text/javascript\" charset=\"UTF-8\">");
            pw.println("alert(\"登录失败！请重新登录！\");");
            pw.println("open(\"login.jsp\",\"_self\");");
            pw.println("</script>");
            pw.close();
        }
    }
}