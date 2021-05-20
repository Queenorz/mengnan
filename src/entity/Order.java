package entity;

import java.util.Date;

/**
 * Created by gjx on 2020/9/12.
 */
public class Order {
    int id;
    String uname;
    String state;
    Date date;
    String remarks;
    String food;
    String zt;
    String price;
    
    String num;
    
    public Order() {
		super();
	}
    
    public Order(int id, String uname, String state, Date date, String remarks, String food) {
        this.id = id;
        this.uname = uname;
        this.state = state;
        this.date = date;
        this.remarks = remarks;
        this.food = food;
    }

    public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getZt() {
		return zt;
	}

	public void setZt(String zt) {
		this.zt = zt;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}

