package Model;
import util.Amount;

public class CashReg {




    private Amount balance;







    public CashReg(){

        this.balance = new Amount(0);

    }

    public Amount getBalance() {
        return balance;
    }


    public void updateBalance(Payment payment) {
        balance = balance.plus(payment.getTotal().getTotalWithTax());
    }


    public void sumPay(Payment payment){
        balance = balance.plus(payment.getTotal().getTotalWithTax());
    }

}
