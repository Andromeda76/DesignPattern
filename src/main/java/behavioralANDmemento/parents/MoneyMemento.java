package behavioralANDmemento.parents;

public sealed interface MoneyMemento permits MementoIMPL {
    void transactionTraceBehavior(Integer integer);

}
