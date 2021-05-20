package biz;

import dao.UserMapper;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtils;

public class UserBiz {
    public User findUser(String uname){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user=userMapper.getUser(uname);
        sqlSession.close(); //关闭连接
        return user;
    }
    public boolean checkLogin(String uname,String upass){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user=userMapper.getUser(uname);
        sqlSession.close(); //关闭连接
        if(user==null)
            return false;
        if(user.getUpass().equals(upass))
            return true;
        else
            return false;
    }
    public void changeInfo(String name,String uname,String upass,String status,String love ,String phone){
        User user=new User(name,uname,upass,status,love,phone);
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.changeInfo(user);
        sqlSession.commit();
        sqlSession.close(); //关闭连接
    }
}
