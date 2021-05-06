package Model;

import java.time.LocalDateTime;
import util.Amount;
public class Receipt {


    private Sale sale;






public Receipt (Sale sale){

    this.sale = sale;

}

private void NewRowReceipt(StringBuilder builder){
    builder.append("\n");
};

private void NewLineReceipt(StringBuilder builder, String line){
    builder.append(line);
    NewRowReceipt(builder);
}

private void TimeDateReceipt(StringBuilder builder){
    LocalDateTime timeOfSale = LocalDateTime.now();
    NewLineReceipt(builder,"Time of Sale "+timeOfSale.toLocalDate().toString());
}

    public void printReceipt(Receipt receipt){
        System.out.println(receipt.toString());
    }
// To get an fictional receipt built on a receipt in sweden//

@Override
public String toString() {
    StringBuilder builder = new StringBuilder();
    NewRowReceipt(builder);
    NewLineReceipt(builder, "------AffärensNamn-------");
    NewLineReceipt(builder, "----------Kvitoo----------");
    TimeDateReceipt(builder);
    NewLineReceipt(builder, "Varor: ");
    NewLineReceipt(builder, sale.toString());

    return builder.toString();
}


    }




