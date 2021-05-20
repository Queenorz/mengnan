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

public class GetAllMemuInfoServlet extends HttpServlet {


    public void init()throws ServletException {
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");
        String name=req.getParameter("name");
        if(req.getParameter("name")==null) {
        	name="";
        }
        FoodBiz foodBiz = new FoodBiz();
        req.setAttribute("allFood",foodBiz.findAllByName(name)); 
        req.getRequestDispatcher("qiantai/index.jsp").forward(req,res);
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        doPost(req,res);
    }
}
