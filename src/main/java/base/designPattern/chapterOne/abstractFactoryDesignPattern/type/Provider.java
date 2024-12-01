package base.designPattern.chapterOne.abstractFactoryDesignPattern.type;


import base.designPattern.chapterOne.abstractFactoryDesignPattern.airPlaneEntity.AirPlaneFactory;
import base.designPattern.chapterOne.abstractFactoryDesignPattern.carEntity.CarFactory;


public abstract class Provider {

    public abstract  <T extends Provider> void providerInstance(Class<T> model);


    public static Provider factoryProvider(Factories factory) {
        return switch (factory.name()) {
            case ("CAR_FACTORY") -> new CarFactory();
            case ("AIR_PLANE_FACTORY") -> new AirPlaneFactory();
            default -> throw new IllegalArgumentException("FACTORY_NOT_FOUND");
        };
    }

}
