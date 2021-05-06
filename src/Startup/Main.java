package Startup;

import Controller.Controller;
import Intergration.SystemCreator;
import Intergration.Printer;
import Intergration.CatCreator;

import View.View;



public class Main {


    public static void main(String[] args) {

    SystemCreator systemCreator =new SystemCreator();
    CatCreator catCreator = new CatCreator();
    Printer printer = new Printer();
    Controller controller = new Controller(systemCreator,catCreator,printer);
    View view = new View(controller);
    view.Exampel();




    }


}
