package Intergration;

import java.util.HashMap;
import java.util.Map;

import Model.Sale;
import util.Amount;

import java.util.Set;


public class InvSys {

    private HashMap<String, Item> inv = new HashMap<>();


    InvSys() {
        selItem();
    }


    public void updateInv(Sale sale) {
        HashMap<String, Item> items = sale.getItems();
        Set entries = items.entrySet();


        for (Object entry : entries) {
            Item item = getCurrentItem(entry);

            if (avaliableIteminInv(item)) {
                removeItemInInv(item);
            }
        }

    }


    private boolean avaliableIteminInv(Item item) {
        return inv.containsKey(item.getBarcode());
    }


    private void removeItemInInv(Item item) {
        Item soldItem = inv.get(item.getBarcode());
        soldItem.minusQuntity(soldItem.getQuntity());
        inv.put(soldItem.getBarcode(), soldItem);
    }


    private Item getCurrentItem(Object entry) {
        Map.Entry mapping = (Map.Entry) entry;
        return (Item) mapping.getValue();
    }

    private void selItem() {
        inv.put("Apple", new Item(new ItemDTO(new Amount(30), "Apple", new Amount(10)), "Apple", new Amount(Integer.MAX_VALUE)));
        inv.put("Biff", new Item(new ItemDTO(new Amount(35), "Biff", new Amount(10)), "Biff", new Amount(Integer.MAX_VALUE)));
        inv.put("Peppar", new Item(new ItemDTO(new Amount(45), "Peppar", new Amount(10)), "Peppar", new Amount(Integer.MAX_VALUE)));
        inv.put("Salt", new Item(new ItemDTO(new Amount(55), "Salt", new Amount(15)), "Salt", new Amount(Integer.MAX_VALUE)));
    }


}
