package dao;
import entity.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface UserMapper {
    List<User> getUserlist();
    User getUser(String uname);
    void changeInfo(User user);

}
