package base.designPattern.chapterOne.factoryDesignPattern.carUsage;

import base.designPattern.chapterOne.factoryDesignPattern.carEntity.SportCar;
import base.designPattern.chapterOne.factoryDesignPattern.factory.CarFactory;

public class SportCarService {


    public static void main(String[] args) {
        SportCarService service = new SportCarService();
        try {
            service.a();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public SportCar a() throws IllegalAccessException {
        SportCar sportCar = null;
       var getSportInstance =  CarFactory.vehicle("SportCar");
       if (getSportInstance instanceof SportCar) {
           sportCar = (SportCar) getSportInstance;
           sportCar.setId(1L);
           sportCar.setDriver("Ali");
           sportCar.setModel("GP");
           System.out.println(sportCar.getDriver() + "   " + sportCar.getModel() +
                   "  " + sportCar.motorModel() + "  " + sportCar.wheelModel());
       }

       return sportCar;
    }


}
