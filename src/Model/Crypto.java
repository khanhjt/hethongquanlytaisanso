package Model;

public class Crypto {
    private String name;
    private double price;
    private double change;

    public Crypto(String name, double price, double change) {
        this.name = name;
        this.price = price;
        this.change = change;
    }

    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public double getprice() {
        return price;
    }
    public void setprice(double price) {
        this.price = price;
    }
    public double getchange() {
        return change;
    }
    public void setchange(double change) {
        this.change = change;
    }
    
}
