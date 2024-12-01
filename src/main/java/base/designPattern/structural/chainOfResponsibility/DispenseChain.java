package base.designPattern.structural.chainOfResponsibility;

public interface DispenseChain {

    void setNextChain(DispenseChain dispenseChain);

    void dispense(Currency currency);

}
