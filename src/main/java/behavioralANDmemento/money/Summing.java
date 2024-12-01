package behavioralANDmemento.money;

import behavioralANDmemento.parents.MoneyExecutor;
import behavioralANDmemento.parents.MoneyMemento;

public class Summing implements MoneyExecutor{

    private final MoneyMemento memento;
    private MoneyExecutor moneyExecutor;


    public Summing(MoneyMemento memento){
        this.memento = memento;
    }

    public void setNextSumming(MoneyExecutor moneyExecutor){
        this.moneyExecutor = moneyExecutor;
    }

    @Override
    public void execute(Integer integer) {
        memento.transactionTraceBehavior(integer);
        integer /= 2;
        moneyExecutor.execute(integer);
    }

}
