package base.designPattern.chapterOne.factoryDesignPattern.factory;


import base.designPattern.chapterOne.factoryDesignPattern.carEntity.AbstractCar;
import base.designPattern.chapterOne.factoryDesignPattern.carEntity.SportCar;
import base.designPattern.chapterOne.factoryDesignPattern.carEntity.StreetCar;

public class CarFactory {

    private CarFactory(){}

    public static AbstractCar<? extends AbstractCar> vehicle(String vehicleModel)
            throws IllegalAccessException {

        return switch(vehicleModel) {
            case ("SportCar") -> new SportCar();
            case ("StreetCar") -> new StreetCar();

            default -> throw new IllegalAccessException("Car not found");
        };
    }
}
