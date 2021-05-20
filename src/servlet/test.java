package servlet;
import biz.FoodBiz;
import biz.OrderBiz;
import biz.UserBiz;
import dao.UserMapper;
import entity.Food;
import entity.Order;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtils;
import utils.Tool;

import java.util.Date;
import java.util.List;

public class test {
    public  static  void main(String args[]){
    //功能测试 查询用户  改变用户信息
//        UserBiz userBiz =new UserBiz();
//        User user=userBiz.findUser("abc");
//        userBiz.changeInfo(user.getName(),user.getUname(),"123456789",user.getStatus(),"Hatsune Miku","15730789695");
//
//    功能测试  按菜系查询菜单
//        FoodBiz foodBiz=new FoodBiz();
//        List<Food> foodList =foodBiz.getFoodlist("chuan");
//        for ( int  i =  0 ;i < foodList.size();i++){
//            System.out.println(foodList.get(i).getName()+foodList.get(i).getNum()+foodList.get(i).getAddress());
//        }
    //功能测试  改变菜单信息
//        foodBiz.changeInfo(1,"麻辣香锅","12.7","wdnmd","nanjing","/23食堂/3楼",15);
//        List<Food> all =foodBiz.findAll();
//        for ( int  i =  0 ;i < all.size();i++){
//            System.out.println(all.get(i).getName()+all.get(i).getNum()+all.get(i).getAddress());
//        }

        //功能测试， 查找 添加订单
//        OrderBiz orderBiz=new OrderBiz();
//        orderBiz.cancleOrder(9);
//        orderBiz.cancleOrder(3);
//        orderBiz.addOrder("abc",new Date(),"不要香菜,铁板麻辣烫","铁板麻辣烫");
//        List<Order> orderList = orderBiz.findOrderByu("abc");
//        for ( int  i =  0 ;i < orderList.size();i++){
//            System.out.println(orderList.get(i).getRemarks()+orderList.get(i).getState()+Tool.Date2Str(orderList.get(i).getDate(), "yyyy-MM-dd HH:mm:ss"));
//       }
        //功能测试  处理book订单
//        orderBiz.dealOrder(1,1);
        //功能测试  处理cancle订单
//        orderBiz.dealCancleOrder(3,0);
//        orderBiz.dealCancleOrder(9,1);

    }

}
