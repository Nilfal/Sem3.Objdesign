package View;

import Controller.Controller;
import util.Amount;


public class View {



    private Controller controller;


    public View (Controller controller){
        this.controller = controller;
    }


    public void Exampel (){
        System.out.println("Start of new sale \n");
        controller.newSale();
        System.out.println("Begins to scan items\n");
        String out = controller.scanItem("Salt",new Amount(1));
        System.out.println(out);
        System.out.println("Total to pay");
        out = controller.displayTotal();
        System.out.println(out);
    }

}
