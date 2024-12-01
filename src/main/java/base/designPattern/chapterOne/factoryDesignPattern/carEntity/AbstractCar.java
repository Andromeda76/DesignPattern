package base.designPattern.chapterOne.factoryDesignPattern.carEntity;

public abstract class AbstractCar<T> implements Cloneable {

    abstract <T> String motorModel();

    abstract <T> String wheelModel();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
