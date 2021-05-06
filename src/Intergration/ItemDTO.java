package Intergration;

import util.Amount;

import java.util.Objects;

public class ItemDTO {


    private final Amount price;
    private final String ItemName;
    private final Amount taxAmount;


    public ItemDTO(Amount price, String itemName, Amount taxAmount) {
        this.price = price;
        this.ItemName = itemName;
        this.taxAmount = taxAmount;
    }

    public Amount getPrice() {
        return price;
    }

    public String getItemName() {
        return ItemName;
    }

    public Amount getTaxAmount() {
        return taxAmount;
    }


    @Override
    public String toString() {
        String builder = "Varor: " + ItemName + "\t" +
                "Pris: " + price + "\t" +
                "Skatt: " + taxAmount + "\t";
        return builder;
    }
}
