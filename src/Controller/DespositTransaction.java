package Controller;

import Model.Account;

public class DespositTransaction extends Transaction{ 
    private final Account _account;
    public DespositTransaction(Account account, double amount) throws Exception{
        super(amount);
        this._account = account;
    }

    public Account Account() {
        return _account;
    }

    @Override
    public double Amount() {
        return super.Amount();
    }   

    @Override
    public boolean Success() {
        return super._success;
    }

    @Override
    public void Print() {
        if (Success()) {
            System.out.println("Giao dịch nạp tiền thành công.");
            System.out.println(_timeStamp); // in ra thoi gian giao dich
            System.out.println(Amount() + " VND đã được nạp vào tài khoản " + Account().getName());
        } else System.out.println("Giao dịch nạp tiền thất bại.");
    }

    public void Execute() throws Exception { //dung de thuc hien giao dich
        super.Execute();
        _success = Account().Desposit(Amount());
    }

    public void Rollback() throws Exception { //dung de huy giao dich
        super.Rollback();
        if (Account().Withdraw(Amount())) {
            System.out.println("Giao dịch nạp tiền đã được hủy.");
            _reversed = true;
        } else System.out.println("Lỗi: Giao dịch nạp tiền không thể hủy.");
    }
}
