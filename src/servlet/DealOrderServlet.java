package servlet;

import biz.OrderBiz;
import entity.Order;

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
public class DealOrderServlet extends HttpServlet {
    private Order order;
    private OrderBiz orderBiz;
    public void init()throws ServletException {
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");
        String food = req.getParameter("food");
        List<Order> orderList = orderBiz.findOrderByfood(food);
        req.setAttribute("orderList", orderList);
        req.getRequestDispatcher("dealOrder.jsp").forward(req, res);
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        doPost(req,res);
    }
}
