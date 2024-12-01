package base.designPattern.structural.chainOfResponsibility;


import base.designPattern.structural.chainOfResponsibility.dispensers.Dollar10Dispenser;
import base.designPattern.structural.chainOfResponsibility.dispensers.Dollar20Dispenser;
import base.designPattern.structural.chainOfResponsibility.dispensers.Dollar50Dispenser;

import java.util.ArrayList;


public class RunChain {

    private final DispenseChain fiftyDispenser;

    public RunChain(){
        this.fiftyDispenser = new Dollar50Dispenser();
        DispenseChain twentyDispenser = new Dollar20Dispenser();
        DispenseChain tenDispense = new Dollar10Dispenser();

        fiftyDispenser.setNextChain(twentyDispenser);
        twentyDispenser.setNextChain(tenDispense);
    }

    public static void main(String[] args) {
        RunChain runChain = new RunChain();
        runChain.fiftyDispenser.dispense(new Currency(40));
    }
}
