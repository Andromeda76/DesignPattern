package base.designPattern.chapterOne.abstractFactoryDesignPattern.type;

public enum Factories {


    CAR_FACTORY(1),
    TRUCK_FACTORY(2),
    AIR_PLANE_FACTORY(3);

    private final Integer A;

    Factories(Integer A){
        this.A = A;
    }

}
