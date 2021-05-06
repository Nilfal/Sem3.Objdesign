package Controller;


import Intergration.Printer;
import Intergration.SystemCreator;
import Intergration.CatCreator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.Amount;

import static org.junit.Assert.assertEquals;

public class TestController {



    private Controller controller;

    @Before
    public void setUp(){

        controller = new Controller(new SystemCreator(),new CatCreator(),new Printer());

    }
    @After
    public void tearDown(){
        controller = null;
    }

    @Test
    public void regItem(){
        controller.newSale();
        String itemName = "Salt";
        Amount price = new Amount (55);
        Amount tax = new Amount(15);
        String actualResult = controller.scanItem(itemName, new Amount(1));
        String expectedResult = "Varor: " + itemName + "\t" +
                "Pris: " + price + "\t" +
                "Skatt: " + tax + "\t" +
                ", Antal: " + new Amount(1) + ", Totalt: " + price;
        assertEquals("RegItem inte samma Strings", expectedResult, actualResult);
    }


    // test for a transaktion with payment and receipt
    @Test
    public void displayTotalWithTax() {
        controller.newSale();
        String itemName = "Salt";
        Amount price = new Amount(55);
        Amount taxAmount = new Amount(15);
        controller.scanItem(itemName, new Amount(1));
        String actualResult = controller.displayTotalWithTax();
        String expectedResult = "total with taxes: " + price.plus(taxAmount);
        assertEquals("Skatten stämmer inte", expectedResult, actualResult);
    }

    @Test
    public void trasaction() {
        controller.newSale();
        String itemName = "Salt";
        Amount price = new Amount(55);
        Amount taxAmount = new Amount(15);
        controller.scanItem(itemName, new Amount(1));
        Amount paidAmount = new Amount(100);

        String expectedResult = "Return Change:" + paidAmount.minus(price.plus(taxAmount));
        String actualResult = controller.transaction(paidAmount);
        assertEquals("Växel stämmer inte", expectedResult, actualResult);
    }
}



