package biz;

import dao.FoodMapper;
import dao.UserMapper;
import entity.Food;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtils;

import java.util.List;

public class FoodBiz {
    public List<Food> getFoodlist(String type){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
        List<Food> foodList= foodMapper.getFoodList(type);
        sqlSession.close(); //close
        return foodList;
    }
    public  List<Food> findAll(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
        List<Food> allFood= foodMapper.getAll();
        sqlSession.close(); //close
        return allFood;
    }
    
    public  List<Food> findAllByName(String name){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
        List<Food> allFood= foodMapper.findAllByName(name); 
        sqlSession.close(); //close
        return allFood;
    }
    
    
    public Food findFood(int id){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
        Food food = foodMapper.findFood(id);
        sqlSession.close(); //close
        return food;
    }
    public void changeInfo(int id,String name,String price,String info,String type,String address,int num){
        Food food=new Food(id,name,price,info,type,address,num);
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
        foodMapper.changeInfo(food);
        sqlSession.commit();
        sqlSession.close(); //关闭连接
    }
    
    
    public void addInfo(String name,String price,String info,String type,String address,int num){
        Food food=new Food(0,name,price,info,type,address,num);
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
        foodMapper.addInfo(food);
        sqlSession.commit();
        sqlSession.close(); //关闭连接
    }
    
    
    public void delete(int id){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
        foodMapper.delete(id);
        sqlSession.commit();
        sqlSession.close(); //关闭连接
    }
    
    
    
}
