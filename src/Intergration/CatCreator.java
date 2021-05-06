package Intergration;

public class CatCreator {

    private DiscountCatalog discountCatalog;
    private ItemCat itemCat;





    public CatCreator(){
        discountCatalog =new DiscountCatalog();
        itemCat = new ItemCat();
    }


    public ItemCat getItemCat() {
        return itemCat;
    }

    public DiscountCatalog getDiscountCatalog() {
        return discountCatalog;
    }
}



