package behavioralANDmemento;

import behavioralANDmemento.money.Reducer;
import behavioralANDmemento.money.Summing;
import behavioralANDmemento.parents.MementoIMPL;


public class RUNNER {


    public static void main(String[] args) {
        MementoIMPL traceIMPL = new MementoIMPL();
        Reducer reducer = new Reducer(traceIMPL);
        Summing summing = new Summing(traceIMPL);

        summing.setNextSumming(reducer);
        summing.execute(10000);
        reducer.execute(100000000);

        traceIMPL.extracted().forEach(System.out::println);
    }
}
