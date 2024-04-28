package Model;

public class DespositTransaction extends Transaction{ 
    private final Account _account;
    public DespositTransaction(Account account, double amount) {
        super(amount);
        _account = account;
    }

    public Account Account() {
        return _account;
    }

    @Override
    public double Amount() {
        return super.Amount();
    }   

    @Override
    public boolean Success()
}
