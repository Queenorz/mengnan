package biz;

import dao.FoodMapper;
import dao.OrderMapper;
import entity.Order;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtils;
import utils.Tool;

import java.util.Date;
import java.util.List;

public class OrderBiz {
    public void addOrder(String uname, Date date, String remarks, String food,String price,String num){
        Order order=new Order(1,uname,"unhandle",date,remarks,food);
        order.setNum(num);
        order.setPrice(price);
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        orderMapper.addOrder(order);
        sqlSession.commit();
        sqlSession.close(); //close

    }
    public List<Order> findOrderByu(String uname){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList= orderMapper.findOrderByu(uname);
        sqlSession.close(); //close
        return  orderList;
    }
    
    public List<Order> findOrderByuforCart(String uname){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList= orderMapper.findOrderByuforCart(uname);
        sqlSession.close(); //close
        return  orderList;
    }
    
    public Order findOrderByid(int id){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        Order order=orderMapper.findOrderByid(id);
        sqlSession.close();
        return  order;
    }
    public List<Order> findOrderByfood(String food){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList = orderMapper.findOrderByfood(food);
        sqlSession.close();
        return  orderList;
    }
    public List<Order> findOrder(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList = orderMapper.findOrder();
        sqlSession.close();
        return  orderList;
    }
    public int deleteOrder(int id){

        SqlSession sqlSession= MybatisUtils.getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        orderMapper.delete(id);
        sqlSession.commit();
        sqlSession.close(); //close
        return 1;
    }
    public void updateOrderzt(String uname){  //处理方式  1代表接收  0代表拒绝
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        orderMapper.orderztUpdate(uname);
        sqlSession.commit();
        sqlSession.close(); //close
    }
    
    public int cancleOrder(int id){
        int flag;
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        Order order = orderMapper.findOrderByid(id);
        if(order.getState().equals("unhandled")||order.getState().equals("accepted")){
            order.setState(order.getState()+"_need_cancle");
            flag=1;
        }
        else {
            flag=0;
            return flag;
        }
        orderMapper.orderStateUpdate(order);
        sqlSession.commit();
        sqlSession.close(); //close
        return flag;
    }
    public void dealOrder(int id,int way){  //处理方式  1代表接收  0代表拒绝
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        Order order = orderMapper.findOrderByid(id);
        if(way==1){
            order.setState("accepted");
        }
        else
            order.setState("refused");
        orderMapper.orderStateUpdate(order);
        sqlSession.commit();
        sqlSession.close(); //close
    }
    public void dealCancleOrder(int id,int way){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        Order order = orderMapper.findOrderByid(id);
        if(way==1){
            order.setState("cancled");
        }
        else
            order.setState("cancle_refused");
        orderMapper.orderStateUpdate(order);
        sqlSession.commit();
        sqlSession.close(); //close
    }
}
