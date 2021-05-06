package util;

public class DiscountRule {

    private double discount;
    private double no_Dscount;


    public DiscountRule(double discount){
        this.discount = discount;
    }


    public DiscountRule(){
        this.discount = no_Dscount;
    }


    public double getDiscount() {
        return discount;
    }
}

