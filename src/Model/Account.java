package Model;

public class Account {
    private String userName;
    private String password;
    private String doDate, doMonth, doYear;
    private String contact;
    private String email;
    private double balance;
    public Account(String userName, String password, String doDate, String doMonth, String doYear, String contact, String email, double balance) {
        this.userName = userName;
        this.password = password;
        this.doDate = doDate;
        this.doMonth = doMonth;
        this.doYear = doYear;
        this.contact = contact;
        this.email = email;
        this.balance = balance;
    }
    public String getuserName() {
        return userName;
    }
    public void setuserName(String userName) {
        this.userName = userName;
    }
    public String getpassword() {
        return password;
    }
    public void setpassword(String password) {
        this.password = password;
    }
    public String getdoDate() {
        return doDate;
    }
    public void setdoDate(String doDate) {
        this.doDate = doDate;
    }
    public String getdoMonth() {
        return doMonth;
    }
    public void setdoMonth(String doMonth) {
        this.doMonth = doMonth;
    }
    public String getdoYear() {
        return doYear;
    }
    public void setdoYear(String doYear) {
        this.doYear = doYear;
    }
    public String getcontact() {
        return contact;
    }
    public void setcontact(String contact) {
        this.contact = contact;
    }
    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }
    public double getbalance() {
        return balance;
    }
    public void setbalance(double balance) {
        this.balance = balance;
    }

    private String _name; // dung de luu ten tai khoan
    private double _balance; // dung de luu so du tai khoan
    public Account(String name, double balance) {
        this._name = name;
        this._balance = balance;
    }
    public String getName() {
        return _name;
    }
    public void setName(String name) {
        this._name = name;
    }
    public double getBalance() {
        return _balance;
    }
    public void setBalance(double balance) {
        this._balance = balance;
    }

    public boolean Desposit(double amount) { // nap tien
        if (amount > 0) {
            this._balance += amount;
            return true;
        }
        return false;
    }

    public boolean Withdraw(double amount) throws Exception { // rut tien, dung ham Exception de xu ly ngoai le
        if (amount > 0 && amount <= this._balance) {
            this._balance -= amount;
            return true;
        }
        return false;
    }

    public void Display() {
        System.out.println("Tài khoản: " + getName() + "Số dư: " + getBalance());  
    }



    
}
