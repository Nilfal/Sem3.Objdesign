package Intergration;
import Model.Sale;

import java.time.LocalDateTime;
import java.util.HashMap;

public class AccountingSystem {


    private HashMap<LocalDateTime,Sale> accounting = new HashMap<>();

    AccountingSystem(){}



    public void ExternalAccounting(Sale sale){
        LocalDateTime timeofsale = LocalDateTime.now();
        accounting.put(timeofsale, sale);
    }

}
