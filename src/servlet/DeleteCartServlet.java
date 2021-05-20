package servlet;

import biz.OrderBiz;
import entity.Order;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by gjx on 2020/9/12.
 */
public class DeleteCartServlet extends HttpServlet {

    public void init()throws ServletException {
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        
        OrderBiz orderBiz = new OrderBiz();
        if (orderBiz.deleteOrder(id) == 1) {
        	
        	User user = (User) req.getSession().getAttribute("user");
        	 List<Order> orderList=orderBiz.findOrderByuforCart(user.getUname());
 	        
 	        req.setAttribute("orderList",orderList);
 	        
 	        req.getRequestDispatcher("qiantai/myCart.jsp").forward(req,res);
        }
       
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        doPost(req,res);
    }
}
