package base.designPattern.chapterOne.abstractFactoryDesignPattern.factory;


import base.designPattern.chapterOne.abstractFactoryDesignPattern.carEntity.CarFactory;
import base.designPattern.chapterOne.abstractFactoryDesignPattern.carEntity.SportCar;
import base.designPattern.chapterOne.abstractFactoryDesignPattern.type.CarModel;
import base.designPattern.chapterOne.abstractFactoryDesignPattern.type.Factories;
import base.designPattern.chapterOne.abstractFactoryDesignPattern.type.Provider;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;


@RestController
public final class FactoryProvider {



    public void a() throws CloneNotSupportedException {
        var factoryInstance=  Provider.factoryProvider(Factories.CAR_FACTORY);
        if (factoryInstance instanceof CarFactory carFactory){
            SportCar sportCar = (SportCar) carFactory.carModel(CarModel.SPORT_CAR);
            sportCar.motorModel();
            SportCar sportCar1 = (SportCar) sportCar.clone();
            sportCar1.setModel("7854");
            sportCar1.getModel();
            System.out.println(Objects.equals(sportCar1, sportCar));
            SportCar sportCar2 = (SportCar) sportCar.clone();
            sportCar2.setModel("899");
            System.out.println(sportCar2.getDriver());
        }
    }


}














