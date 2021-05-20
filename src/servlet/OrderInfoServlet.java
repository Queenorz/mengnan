package servlet;

import biz.FoodBiz;
import biz.OrderBiz;
import biz.UserBiz;
import entity.Food;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OrderInfoServlet extends HttpServlet {
    

    public void init()throws ServletException {
    }
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        doPost(req,res);
    }
    
	
	
	
	
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");
        String type = req.getParameter("type");

        if(type.equals("orderlist")) {
        	foodlist(req,res);
        }
        
    }
    private void foodlist(HttpServletRequest req, HttpServletResponse res) {
    	try {
    		OrderBiz orderBiz = new OrderBiz();
			req.setAttribute("orderList", orderBiz.findOrder());
			req.getRequestDispatcher("admin/order/orderall.jsp").forward(req, res);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

    
}
