package Model;
import util.Amount;

import Intergration.Item;

public class Total {




    private Amount total;
    private Amount totalTax;







    public Total(){
        this.total = new Amount(0);
        this.totalTax = new Amount (0);
    }


    public Amount getTotal() {
        return total;
    }

    public Amount getTotalTax() {
        return totalTax;
    }


    public Amount getTotalWithTax(){
        return total.plus(totalTax);
    }


    public void updateTotal(Item item){
        Amount amountofItems= item.getQuntity();
        Amount itemPrice = item.getItemDesc().getPrice();
        Amount itemTax = item.getItemDesc().getTaxAmount();



        this.totalTax = this.totalTax.plus(amountofItems.multiply(itemTax));
        this.total = this.total.plus(amountofItems.multiply(itemPrice));
    }
}
