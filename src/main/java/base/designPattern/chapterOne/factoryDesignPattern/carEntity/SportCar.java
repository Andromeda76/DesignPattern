package base.designPattern.chapterOne.factoryDesignPattern.carEntity;

public class SportCar extends AbstractCar {

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
    public String motorModel() {
        System.out.println("MOTO_GP_511");
        return "MOTO_GP_511";
    }

    @Override
    public String wheelModel() {
        System.out.println("MOTO_WH_511");
        return "MOTO_WH_511";
    }

}
