package base.designPattern.chapterOne.factoryDesignPattern.carEntity;

import java.util.Arrays;
import java.util.List;

public class StreetCar extends AbstractCar {

    private Long id;

    private String model;

    private String driver;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
     String motorModel() {
        List.of(1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 11).
                subList(5, 9).forEach(System.out::println);

        var x = Arrays.asList(1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 11).toArray();
        int a = Arrays.binarySearch(x, 3);

        return "STREET_710";
    }


    @Override
     String wheelModel() {
        return "WH_STREET_710";
    }


}
