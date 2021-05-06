package util;

public class Amount {


    private final int amount;


    public Amount (int amount){
        this.amount = amount;
    }


    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return Integer.toString (amount);   }




        public Amount minus (Amount otherA) {
        return new Amount(this.amount - otherA.amount);
        }
    public Amount plus (Amount otherA) {
        return new Amount(this.amount + otherA.amount);
    }


    public Amount multiply(Amount otherA){return new Amount (this.amount * otherA.amount);}
}
