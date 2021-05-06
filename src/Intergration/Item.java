package Intergration;

import util.Amount;

public class Item {

    /*** Item is represetned of 3 things, Itemdescription,Barcode and quiantity. ***/

    private ItemDTO itemDesc;
    private String barcode;
    private Amount quntity;


    public Item(ItemDTO itemDesc, String barcode, Amount quntity) {
        this.itemDesc = itemDesc;
        this.barcode = barcode;
        this.quntity = quntity;
    }


    public ItemDTO getItemDesc() {
        return itemDesc;
    }

    public Amount getQuntity() {
        return quntity;
    }


    public void minusQuntity(Amount oQuantity) {
        this.quntity = this.quntity.minus(oQuantity);
    }

    public void plusQuntity(Amount oQuntity) {
        this.quntity = this.quntity.plus(oQuntity);
    }

    public String getBarcode() {
        return barcode;
    }


}
