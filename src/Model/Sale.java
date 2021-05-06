package Model;
import Intergration.Item;
import Intergration.ItemDTO;

import java.util.HashMap;


public class Sale {


    private Total total;
    private HashMap<String, Item> items = new HashMap<>();


    public Sale() {
        this.total = new Total();
    }

    public Total getTotal() {
        return total;
    }

    public HashMap<String, Item> getItems() {
        return items;
    }


    public String saleRefresh(Item item) {

        if (itemListConatins(item)) {
            updateItemQuantityAndTotal(item);
        } else {
            scanedItemUpdateTotal(item);
        }


        return item.getItemDesc().toString();
    }


    private boolean itemListConatins(Item item) {

        return items.containsKey(item.getBarcode());

    }

    private void updateItemQuantityAndTotal(Item item) {
        Item solditem = items.get(item.getBarcode());
        solditem.plusQuntity(item.getQuntity());
        items.put(solditem.getBarcode(), solditem);
        total.updateTotal(item);
    }

    public void scanedItemUpdateTotal(Item item) {
        items.put(item.getBarcode(), item);
        total.updateTotal(item);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        addNewLine(builder,"Vara :"+ "Salt");
        addNewLine(builder, "Total: " + total.getTotal().toString());
        addNewLine(builder, "Skatt: " + total.getTotalTax());
        return builder.toString();
    }

    private void addNewLine(StringBuilder builder, String line) {
        builder.append(line);
        builder.append("\n");

    }


}


