package behavioralANDmemento.money;


import behavioralANDmemento.parents.MoneyExecutor;
import behavioralANDmemento.parents.MoneyMemento;


public class Reducer implements MoneyExecutor {

    private final MoneyMemento memento;

    private MoneyExecutor moneyExecutor;

    public Reducer(MoneyMemento memento){
        this.memento = memento;
    }

    public void setNextSumming(MoneyExecutor moneyExecutor){
        this.moneyExecutor = moneyExecutor;
    }

    @Override
    public void execute(Integer integer) {
        memento.transactionTraceBehavior(integer);
        integer *= 5;
        if (integer == 0) {
            moneyExecutor.execute(integer);
        }
    }
}
