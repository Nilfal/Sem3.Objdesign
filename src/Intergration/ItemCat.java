package Intergration;

import java.util.HashMap;

import util.Amount;

public class ItemCat {

    private HashMap<String, ItemDTO> listItems = new HashMap<>();

    ItemCat() {
        selItem();
    }

    public boolean avaliableItem(String barcode) {
        return listItems.containsKey(barcode);
    }


    public Item getItem(String bacrode, Amount quantity) {
        if (avaliableItem(bacrode)) {
            return new Item(listItems.get(bacrode), bacrode, quantity);
        }
        return null;
    }


    private void selItem() {
        listItems.put("Apple", new ItemDTO(new Amount(30), "Apple", new Amount(10)));
        listItems.put("Biff", new ItemDTO(new Amount(35), "Biff", new Amount(10)));
        listItems.put("Peppar", new ItemDTO(new Amount(45), "Peppar", new Amount(10)));
        listItems.put("Salt", new ItemDTO(new Amount(55), "Salt", new Amount(15)));


    }

}
