package Model;

import util.Amount;

import java.time.LocalDateTime;

public class Payment {

    private Amount payAmount;
    private Total total;


    public Payment(Amount payAmount, Total total) {

        this.payAmount = payAmount;
        this.total = total;
    }


    public Total getTotal() {
        return total;
    }

    public Amount getPayAmount() {
        return payAmount;
    }

    public Amount getReturnChange() {

        return payAmount.minus(total.getTotalWithTax());

    }
}
