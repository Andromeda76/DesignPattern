package base.designPattern.chapterOne.abstractFactoryDesignPattern.carEntity;


import base.designPattern.chapterOne.abstractFactoryDesignPattern.type.CarModel;
import base.designPattern.chapterOne.abstractFactoryDesignPattern.type.Provider;


public sealed class CarFactory extends Provider permits SportCar, StreetCar{


    public CarFactory carModel(CarModel model) {
        return switch (model.name()) {
            case ("SPORT_CAR") -> new SportCar();
            case ("STREET_CAR") -> new StreetCar();
            default -> throw new IllegalArgumentException("NOT_FOUND");
        };
    }

    @Override
    public <T extends Provider> void providerInstance(Class<T> model) {
        System.out.println(model.getSimpleName());
    }

}
