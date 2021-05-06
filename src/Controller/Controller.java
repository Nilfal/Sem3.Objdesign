package Controller;

import Intergration.*;
import Model.CashReg;
import Model.Receipt;
import Model.Sale;
import Model.Payment;
import util.Amount;



public class Controller {
 private Sale sale;
 private InvSys invSys;
 private Printer printer;
 private CashReg cashReg;
 private ItemCat itemCat;
 private AccountingSystem accountingSystem;
 private DiscountCatalog discountCatalog;





 public Controller (SystemCreator systemCreator, CatCreator catCreator, Printer printer){
     this.invSys = systemCreator.getInventorySystem();
     this.printer = printer;
     this.cashReg = new CashReg();
     this.itemCat = catCreator.getItemCat();
     this.accountingSystem = systemCreator.getAccountingSystem();
     this.discountCatalog = catCreator.getDiscountCatalog();
 }

 public void newSale(){
     this.sale = new Sale();

 }


 public String scanItem (String barcode, Amount quantity){
     if (itemCat.avaliableItem(barcode)){
         Item item = itemCat.getItem(barcode,quantity);
         return sale.saleRefresh(item) + ", Antal: " + quantity.toString() +
                 ", Totalt: " + displayTotal();
     }
     return "running total" + displayTotal();
 }

 public String displayTotal(){

     return sale.getTotal().getTotal().toString();

 }


 public String transaction (Amount customerPay){
     Payment payment = new Payment(customerPay, sale.getTotal());
     cashReg.sumPay(payment);
     Receipt receipt = new Receipt(sale);
     printer.printRec(receipt);
     accountingSystem.ExternalAccounting(sale);
     invSys.updateInv(sale);
     sale = null;
     return "Return Change:" + payment.getReturnChange().toString();


 }
    public String displayTotalWithTax(){
        return "total with taxes: " + sale.getTotal().getTotalWithTax().toString();
    }

}
