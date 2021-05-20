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
public class CancleOrderServlet extends HttpServlet {
    private Order order;
    private OrderBiz orderBiz;
    public void init()throws ServletException {
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        if (orderBiz.cancleOrder(id) == 1)
            req.getRequestDispatcher("searchBeforeOrder.jsp").forward(req, res);
        else {
            res.setCharacterEncoding("UTF-8");
            res.setContentType("text/html; charset=UTF-8");
            PrintWriter pw =res.getWriter();
            pw.println("<script type=\"text/javascript\" charset=\"UTF-8\">");
            pw.println("alert(\"无法再取消订单！\");");
            pw.println("open(\"searchBeforeOrder.jsp\",\"_self\");");
            pw.println("</script>");
            pw.close();
        }
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        doPost(req,res);
    }
}
