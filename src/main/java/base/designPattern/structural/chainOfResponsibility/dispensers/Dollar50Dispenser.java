package base.designPattern.structural.chainOfResponsibility.dispensers;

import base.designPattern.structural.chainOfResponsibility.Currency;
import base.designPattern.structural.chainOfResponsibility.DispenseChain;

public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }


    @Override
    public void dispense(Currency currency) {
        if(currency.amount() >= 50){
            int num = currency.amount()/50;
            int remainder = currency.amount() % 50;
            System.out.println("Dispensing "+num+" 50$ note");
            if(remainder !=0) this.dispenseChain.dispense(new Currency(remainder));
        } else {
            this.dispenseChain.dispense(currency);
        }
    }

}
