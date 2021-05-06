package Intergration;

import Intergration.AccountingSystem;
import Intergration.InvSys;
import Model.CashReg;

public class SystemCreator {



    private AccountingSystem accountingSystem;
    private InvSys inventorySystem;



    /* SystemCreator makes creates the diffrent systems*/

    public SystemCreator (){
        inventorySystem = new InvSys();
        accountingSystem = new AccountingSystem();
    }

    /* getter methods for inventorysystem & accoutingsystem*/

    public InvSys getInventorySystem() {
        return inventorySystem;
    }

    public AccountingSystem getAccountingSystem() {
        return accountingSystem;
    }


}
