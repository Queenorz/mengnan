package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Order;

public interface OrderMapper {
    void addOrder(Order order);
    List<Order> findOrderByu(@Param(value="uname") String uname);
    
    List<Order> findOrderByuforCart(@Param(value="uname") String uname);
    
    Order findOrderByid(int id);
    List<Order> findOrderByfood(String food);
    
    List<Order> findOrder();
    
    void orderStateUpdate(Order order);
    
    void orderztUpdate(@Param(value="uname") String uname);
    
    
    void delete(int id);
}
