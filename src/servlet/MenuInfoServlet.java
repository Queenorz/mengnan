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

public class MenuInfoServlet extends HttpServlet {
    

    public void init()throws ServletException {
    }
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        doPost(req,res);
    }
    
	
	
	
	
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");
        String type = req.getParameter("type");
        if(type.equals("delete")) {
        	delete(req,res);
        }
        if(type.equals("update")) {
        	update(req,res);
        }
        if(type.equals("add")) {
        	add(req,res);
        }
        if(type.equals("getbyid")) {
        	getbyid(req,res);
        }
        if(type.equals("foodlist")) {
        	foodlist(req,res);
        }
        
    }
    private void foodlist(HttpServletRequest req, HttpServletResponse res) {
    	try {
    		FoodBiz foodBiz = new FoodBiz();
			req.setAttribute("allFood", foodBiz.findAll());
			req.getRequestDispatcher("admin/food/foodAll.jsp").forward(req, res);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	private void getbyid(HttpServletRequest req, HttpServletResponse res) {
    	try {
			FoodBiz foodBiz = new FoodBiz();
			int id=Integer.parseInt(req.getParameter("id"));
			Food food = foodBiz.findFood(id);
			
			req.setAttribute("food",food);
			
			req.getRequestDispatcher("admin/food/foodupdate.jsp").forward(req,res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void add(HttpServletRequest req, HttpServletResponse res) {
		try {
			FoodBiz foodBiz = new FoodBiz();
			String name = req.getParameter("name");
			String price = req.getParameter("price");
			String info = req.getParameter("info");
			String type = req.getParameter("typename");
			String address = req.getParameter("address");
			int num = Integer.parseInt(req.getParameter("num"));
			foodBiz.addInfo(name, price, info, type, address, num);
			req.setAttribute("allFood", foodBiz.findAll());
			req.getRequestDispatcher("admin/food/foodAll.jsp").forward(req, res);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	private void update(HttpServletRequest req, HttpServletResponse res) {
		try {
			int id=Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			String price = req.getParameter("price");
			String info = req.getParameter("info");
			String type = req.getParameter("typename");
			String address = req.getParameter("address");
			int num = Integer.parseInt(req.getParameter("num"));
			
			FoodBiz foodBiz = new FoodBiz();
			foodBiz.changeInfo(id, name, price, info, type, address, num);
			req.setAttribute("allFood", foodBiz.findAll());
			req.getRequestDispatcher("admin/food/foodAll.jsp").forward(req, res);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


    public void delete(HttpServletRequest req, HttpServletResponse res) {
    	try {int id=Integer.parseInt(req.getParameter("id"));
    	FoodBiz foodBiz = new FoodBiz();
    	foodBiz.delete(id);
    	req.setAttribute("allFood", foodBiz.findAll());
		req.getRequestDispatcher("admin/food/foodAll.jsp").forward(req, res);
	} catch (Exception e) {
		// TODO: handle exception
	}
    }
    
    
}
