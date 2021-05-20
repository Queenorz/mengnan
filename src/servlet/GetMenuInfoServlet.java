package servlet;

import biz.FoodBiz;
import biz.UserBiz;
import entity.Food;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetMenuInfoServlet extends HttpServlet {
    

    public void init()throws ServletException {
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");
        FoodBiz foodBiz = new FoodBiz();
        Food food = new Food();
        int id=Integer.parseInt(req.getParameter("id"));

        food=foodBiz.findFood(id);
        req.setAttribute("food",food);
        req.setAttribute("allFood",foodBiz.findAll());
        req.getRequestDispatcher("qiantai/goodsDetailQian.jsp").forward(req,res);
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        doPost(req,res);
    }
}
