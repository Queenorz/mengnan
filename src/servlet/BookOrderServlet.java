package servlet;

import biz.FoodBiz;
import biz.OrderBiz;
import biz.UserBiz;
import entity.Order;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;


public class BookOrderServlet extends HttpServlet {

    public void init()throws ServletException {
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");

        
        if(req.getSession().getAttribute("user")==null) {
        	 res.setCharacterEncoding("UTF-8");
             res.setContentType("text/html; charset=UTF-8");
             PrintWriter pw =res.getWriter();
             pw.println("<script type=\"text/javascript\" charset=\"UTF-8\">");
             pw.println("alert(\"请登录后操作！\");");
             pw.println("open(\"login.jsp\",\"_self\");");
             pw.println("</script>");
             pw.close();
        }else {
        
        	
            OrderBiz orderBiz = new OrderBiz();
        	
        	User user = (User) req.getSession().getAttribute("user");
        	
	        Date date=new Date();
	        String remarks =req.getParameter("remarks");
	        String food = req.getParameter("food");
	        
	        String num = req.getParameter("num");
	        String price = req.getParameter("price");
	        
	        orderBiz=new OrderBiz();
	        
	        orderBiz.addOrder(user.getUname(),date,remarks,food,price,num);
	        
	        List<Order> orderList=orderBiz.findOrderByuforCart(user.getUname());
	        
	        req.setAttribute("orderList",orderList);
	        
	        req.getRequestDispatcher("qiantai/myCart.jsp").forward(req,res);
        }
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        doPost(req,res);
    }
}
