package behavioralANDmemento.parents;

import java.util.Stack;

public final class MementoIMPL implements MoneyMemento {

    private Integer money;

    @Override
    public void transactionTraceBehavior(Integer integer) {
        setMoney(integer);
    }

    public Stack<Integer> extracted() {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.add(getMoney());

        return integerStack;
    }

    private Integer getMoney() {
        return money;
    }

    private void setMoney(Integer money) {
        this.money = money;
    }

}
