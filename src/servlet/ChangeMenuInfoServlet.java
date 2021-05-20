package servlet;

import biz.FoodBiz;
import entity.Food;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by gjx on 2020/9/12.
 */
public class ChangeMenuInfoServlet extends HttpServlet {
    private Food food;
    private FoodBiz foodBiz;
    public void init()throws ServletException {
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");

        int id=Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        String price=req.getParameter("uname");
        String info=req.getParameter("upass");
        String type =req.getParameter("status");
        String address=req.getParameter("love");
        int num=Integer.parseInt(req.getParameter("num"));

        FoodBiz foodBiz =new FoodBiz();
        food=foodBiz.findFood(id);

        foodBiz.changeInfo(id,name,price,info,type,address,num);
        req.setAttribute("food",food);
        req.setAttribute("allFood",foodBiz.findAll());
        req.getRequestDispatcher("getMenuInfo.jsp").forward(req,res);
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        doPost(req,res);
    }
}
