package entity;

/**
 * Created by gjx on 2020/9/12.
 */
public class User {
    String name;
    String uname;
    String upass;
    String status;
    String love;
    String phone;

    public User() {
		super();
	}
    
    
    public User(String name, String uname, String upass, String status, String love, String phone) {
        this.name = name;
        this.uname = uname;
        this.upass = upass;
        this.status = status;
        this.love = love;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
