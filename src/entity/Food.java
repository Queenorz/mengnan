package entity;

public class Food {
    int id;
    String name;
    String price;
    String info;
    String type;
    String address;
    int num;

    
    
    public Food() {
		super();
	}

	public Food(int id, String name, String price, String info, String type, String address, int num) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.info = info;
        this.type = type;
        this.address = address;
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
