package Controller;

import java.sql.Timestamp; // timestamp dung de xac dinh thoi gian giao dich
import java.util.Date; // dung de lay thoi gian hien tai

public class Transaction {
    protected double _amount; //protected: chi co the truy cap tu class con
    protected boolean _success, _executed, _reversed; // bien boolean dung de kiem tra giao dich co thanh cong hay khong, da thuc hien hay chua, da bi huy hay chua
    protected Date _dateStamp; //dung de lay thoi gian hien tai
    protected Timestamp _timeStamp; //dung de xac dinh thoi gian giao dich

    public Transaction(double amount) throws Exception {
        if (amount > 0) this._amount = amount;
        else throw new Exception("Lỗi: Số tiền không thể là giá trị âm.");  
    }
    
    public double Amount() {
        return _amount;
    }

    public abstract boolean Success(); //abstract dung de chi ra rang phuong thuc nay se duoc dinh nghia trong class con
    public abstract void Print();

    public boolean Executed() {
        return _executed;
    }

    public boolean Reversed() {
        return _reversed;
    }

    public Date DateStamp() {
        return _dateStamp;
    }

    public Timestamp Timestamp() {
        _dateStamp = new Date();
        long time = _dateStamp.getTime();
        return new Timestamp(time);
    }

    public void Execute() throws Exception {
        if (Executed())
            throw new Exception("Lỗi: Giao dịch đã được thực hiện.");
        _executed = true;
        _timeStamp = Timestamp();
    }

    public void Rollback() throws Exception {
        if (Reversed())
            throw new Exception("Lỗi: Giao dịch đã được hủy.");
        else if (!Executed())
            throw new Exception("Lỗi: Giao dịch chưa được thực hiện.");
        else if (Executed() && !Success()) throw new Exception("Lỗi: Giao dịch không thành công.");
        _reversed = true;
        _timeStamp = Timestamp();
    }
}
